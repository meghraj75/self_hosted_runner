package com.linkedlist;

public class Other {
    public int add(int a,int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Another a=new Another();

        Other o=new Other();
        int sum=o.add(10,20);
        System.out.println(sum);
        a.call();
    }
}
