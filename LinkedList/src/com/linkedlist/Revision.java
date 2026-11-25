package com.linkedlist;



public class Revision {
    public static class Node{
        int data;
        Node next;
           public Node (int data){
               this.data=data;
               this.next=null;

           }
    }
    public static Node head;
    public static Node tail;
  static int  size;
       public void addFirst(int data){
           Node newNode=new Node(data);
           size++;
           if(head==null){
               head=tail=newNode;
               return;
           }
           newNode.next=head;
           head=newNode;

       }
       public void addLast(int data){
           Node newNode=new Node(data);
           size ++;
           if(head==null){
               head=tail=newNode;
               return;
           }
           tail.next=newNode;
           tail=newNode;

       }

       public int removeFirst(){
           int val=head.data;
           head=head.next;
           return val;
       }
        public int removeLast(){
           int val=head.data;
           head=tail=null;
           return val;
        }

       public void print(){
           Node temp=head;
           while(temp!=null){
               System.out.print(temp.data+"=>");
             temp=temp.next;
           }
           System.out.println("null");
      }
    public static boolean isCycle(){
      Node slow =head;
     Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        if(slow==fast){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
    Revision ll= new Revision();
//        ll.addFirst(2);
//        ll.print();

        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(2);
        ll.print();
//        System.out.println(size);
//        ll.removeFirst();
//        ll.print();
        ll.removeLast();
        ll.print();

    }
}


