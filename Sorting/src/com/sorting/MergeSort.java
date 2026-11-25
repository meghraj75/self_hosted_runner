//package com.sorting;
//
//public class MergeSort {
//
//    public static void printArr(String str[]) {
////        for (int i = 0; i < str.length(); i++) {
////            System.out.print(str[i] + " ");
//        }
////        System.out.println();
////    }
//
//    public static void mergeSort(String str[], int si, int ei) {
//        if(si>=ei){
//            return ;
//        }
//
//        int mid = si + (ei - si) / 2;
//        mergeSort(str, si, mid);
//        mergeSort(str, mid + 1, ei);
//        merge(str,si,ei,mid);
//    }
//    public static void merge(String str[],int si,int ei,int mid){
//        String temp[]=new String[ei-si+1];
//        int i=si;
//        int j=mid+1;
//        int k=0;
//        while(i<=mid && j<=ei){
//            if(str.charAt[i]<str.charAt[j]){
//                temp[k]=str[i];
//                i++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String str[] = {"sun", "earth", "mars", "mercury"};
//
//    }
//}