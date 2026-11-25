package com.linkedlist;

public class DeleteFromNthNode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
        System.out.println("null");
    }

   public void deleteNthNodeFromEnd(int n){

        int sz=0;
       Node temp=head;
        while(temp!=null){
            temp=temp.next;
        sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }

        int i=1;
        int indToFind=sz-n;
        Node prev=head;
        while (i<indToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
   }

    public static void main(String[] args) {
        DeleteFromNthNode d=new DeleteFromNthNode();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.deleteNthNodeFromEnd(1);
        d.print();
    }
}
