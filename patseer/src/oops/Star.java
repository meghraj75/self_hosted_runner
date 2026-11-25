package oops;



class Rek {
    int data;
    // Parameterized constructor
    Rek(int data) {
        this.data = data;
    }
    // Copy constructor
    Rek(Rek obj) {
        this.data = obj.data;
    }
}


public class Star {
    public static void main(String[] args) {
        Rek obj1 = new Rek(10);
        Rek obj2 = new Rek(obj1);  // Using copy constructor
        System.out.println(obj2.data);
    }
}
