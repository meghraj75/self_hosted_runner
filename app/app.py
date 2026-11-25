from flask import Flask, jsonify, request
import sqlite3
import os

app = Flask(__name__)

DB_PATH = os.getenv("DB_PATH", "/data/app.db")


def get_db():
    os.makedirs(os.path.dirname(DB_PATH), exist_ok=True)
    conn = sqlite3.connect(DB_PATH)
    conn.row_factory = sqlite3.Row
    return conn


def init_db():
    conn = get_db()

    conn.execute("""
        CREATE TABLE IF NOT EXISTS users (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            email TEXT NOT NULL UNIQUE
        )
    """)

    conn.commit()
    conn.close()


@app.route("/")
def home():
    return jsonify({
        "message": "Python application is running",
        "status": "healthy"
    })


@app.route("/health")
def health():
    return jsonify({"status": "UP"})


@app.route("/users", methods=["GET"])
def get_users():
    conn = get_db()
    users = conn.execute(
        "SELECT id, name, email FROM users"
    ).fetchall()
    conn.close()

    return jsonify([dict(user) for user in users])


@app.route("/users", methods=["POST"])
def create_user():
    data = request.get_json()

    if not data or not data.get("name") or not data.get("email"):
        return jsonify({
            "error": "name and email are required"
        }), 400

    try:
        conn = get_db()

        cursor = conn.execute(
            "INSERT INTO users (name, email) VALUES (?, ?)",
            (data["name"], data["email"])
        )

        conn.commit()

        user_id = cursor.lastrowid
        conn.close()

        return jsonify({
            "id": user_id,
            "name": data["name"],
            "email": data["email"]
        }), 201

    except sqlite3.IntegrityError:
        return jsonify({
            "error": "email already exists"
        }), 409


init_db()


if __name__ == "__main__":
    app.run(
        host="0.0.0.0",
        port=5000
    )