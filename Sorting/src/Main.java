//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>ei){
            return;

        }
        int mid=si-(ei+si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(int arr[],int si,int ei,int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for remaining element
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei) {
            temp[k++] = arr[j++];
        }
        for(k=0,i=si;k<temp.length;  k++,i++){
            arr[i]=temp[k];
        }
    }



    public static void main(String[] args) {
        int arr[]={4,3,1,2,0};
        mergeSort(arr,0,arr.length );
        printArr(arr);
    }
}