package com.basic;

public class PrintNDesc {
    public static void printDesc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDesc(n-1);
    }
    public static void main(String[] args) {
      printDesc(5);
    }
}
