package com.basic;

public class OccurenceArray {
    public static int occurence(int arr[],int key,int i){
        if(i==arr.length) {
            return -1;
        }
         if(arr[i]==key){;
             System.out.println(i);
         }
       return  occurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        int i=0;
        System.out.println(occurence(arr,key,i));
    }
}
