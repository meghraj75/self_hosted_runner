public class LongestSubarraySum {
    public static void subArraySum(int arr[],int k){
        int maxLength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<=k){
                  maxLength=Math.max(maxLength,j-1+1);
                }else if(sum>k){
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int k=14;
        subArraySum(arr,k);
        
    }
}
