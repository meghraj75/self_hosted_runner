import java.util.HashSet;
import java.util.Set;

public class Duplicate {
// brute force
//    public static void duplicateSet(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!set.add(arr[i])) {
//                System.out.println("Duplicate found: " + arr[i]);
//            }
//        }
//    }


    public static int  duplicateOptimize(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3,4};
//        duplicateSet(arr);
        System.out.println(duplicateOptimize(arr));
    }
}
