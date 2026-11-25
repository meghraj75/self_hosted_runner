public class MajorityEle {

    public static int countMajority (int arr[]){
        int cnt =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }
            if(cnt>arr.length/2){
                return cnt;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};
        System.out.println(countMajority(arr));
    }
}
