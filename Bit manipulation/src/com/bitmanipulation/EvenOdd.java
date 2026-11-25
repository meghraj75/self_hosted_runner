package com.bitmanipulation;

public class EvenOdd {
    public static void evenodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even numberr");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        evenodd(2);
        evenodd(3);
    }
}
