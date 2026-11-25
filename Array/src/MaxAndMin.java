import java.util.Arrays;

public class MaxAndMin {
    public static int max(int[] arr){
        int minArr=Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
              if(arr[i]>minArr){
                  minArr=arr[i];
              }

          }
        return minArr;
    }
    public static int min(int[] arr){
        int maxArr=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[maxArr]){
                maxArr=i;
            }
        }
        return maxArr;
    }

    public static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] arr ={2,-5,27,-83,1,};
//        System.out.println(max(arr));
        System.out.println(min(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
