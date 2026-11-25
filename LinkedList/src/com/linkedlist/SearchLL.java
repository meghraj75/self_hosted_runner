package com.linkedlist;

public class SearchLL {
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
        if(head ==null){
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

    //search in linked list

     public int itrsearch(int key){
          Node temp=head;
          int i=0;
          while(temp!=null){
              if(temp.data==key){
                  return i;
              }
              //otherwise find in next nodes
              temp=temp.next;
              i++;
          }
          //not found
          return -1;
     }
    public static void main(String[] args) {
        SearchLL ll=new SearchLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
System.out.println("key means data in ll  which is index "+ll.itrsearch(2));
    }
}
