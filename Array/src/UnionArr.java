import java.util.*;

public class UnionArr {

    //brute force
    public static void array(int arr1[],int arr2[]){
       Set<Integer>st=new HashSet<>();
       for(int i=0;i<arr1.length;i++){
           st.add(arr1[i]);
       }
       for(int j=0;j<arr2.length;j++){
           st.add(arr2[j]);
       }

       for(int a:st){
           System.out.println(a);
       }
    }

    //optimal
    public static void TwoPointerApproach(int arr1[],int arr2[]){
       List<Integer>e=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]<arr2[j]&&arr1[i]!=arr2[j]){
                   // e.add(arr1[i]arr2[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,3,4,5,6,6};
        int arr2[]={1,2,3,4,5,6,7};
        array(arr1,arr2);
    }
}
