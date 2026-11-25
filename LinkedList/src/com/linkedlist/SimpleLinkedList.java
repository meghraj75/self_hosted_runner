package com.linkedlist;

public class SimpleLinkedList {
    public static class Node{
       //variable of node
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
      public static Node head;
     public static Node tail;
     static int size;
     //add in linkedlist first
     public void addFirst(int data){
         Node newNode = new Node(data);
             if (head == null){
                 head=tail=newNode;
                 return;
             }
             newNode.next=head;
             head=newNode;

     }

     //add in linkedlist last
    public void addLast(int data){
         Node newNode=new Node(data);
         size++;
         if(head==null){
             head=tail=newNode;
             return;
         }
         tail.next=newNode;
         tail=newNode;

    }

    //print a  linkedlist

    public void print(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" =>");
             temp=temp.next;
         }
         System.out.println("null");
    }
      public void addMiddle(int data,int index){
         if(index==0){
             addFirst(data);// if index is o then add in first index
         }
         Node newNode=new Node(data);
         size++;
         Node temp=head;//create head is temp node
         int i=0;
           while(i<index-1){
               temp=temp.next;
               i++;
           }
           newNode.next=temp.next;
           temp.next=newNode;

      }

        public int removeFirst(){
         if(size==0){
             System.out.println("ll is empty");
             return Integer.MIN_VALUE;
         }
         else if (size==1){
           int val=head.data;
           head=tail=null;
         }
         int val=head.data;
         head=head.next;
         size--;
         return val;

        }

        public int removeLast(){
         if(size==0){
            System.out.println("linked list is empty");
         }else if(size==1){
             int val=head.data;
             head=tail=null;
             size=0;
             return val;
         }
         Node prev=head;
         for(int i=0;i<size-2;i++){
             prev=prev.next;

         }
         int val=prev.next.data;
         prev.next=null;
         tail=prev.next;
         size--;
         return val;
        }

    public static void main(String[] args) {
        SimpleLinkedList ll=new SimpleLinkedList();
//        ll.addLast(1);
//        ll.print();
//        ll.addLast(2);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//        ll.addLast(3);
//        ll.print();
//        ll.addLast(4);
//        ll.print();
//        ll.addMiddle(8,2);
//        ll.print();
//        System.out.println(ll.size);//size means all total nodes in linked list is 4
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();


        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
    }


}
