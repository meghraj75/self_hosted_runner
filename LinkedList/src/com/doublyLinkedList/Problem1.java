package com.doublyLinkedList;

import com.linkedlist.SimpleLinkedList;

public class Problem1 {
    public static class Node{
        //variable of node
        int data;
        Node next;
        Node prev;

        public Node(int data,Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }


        //if the element is single then it prev and next is null 
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }

    public static void main(String[] args) {

    }
}
