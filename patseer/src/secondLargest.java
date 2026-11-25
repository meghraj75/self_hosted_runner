public class secondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int largest=arr[0];
        int selarge=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                selarge=largest;
                largest=arr[i];

            }else if(arr[i]<largest && arr[i]>selarge){
                selarge=arr[i];
            }
        }
        System.out.println(selarge);
    }
}
