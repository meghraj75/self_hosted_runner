public class LeftRotate {
    public static int[] leftRotateByOnePlace(int[] arr){
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;
            return arr;
        }


        public static void leftRotatedByDPlaces(int[] arr){
            int d=2;
        int temp[]={1,2,3};
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];

        }
        int j=0; //for temp arr j start from 0
        for(int i=arr.length-d;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};

//            leftRotateByOnePlace(arr);
//            for(int i:arr){
//                System.out.print(i); //234561
//            }

            leftRotatedByDPlaces(arr);
            for(int i:arr){
                System.out.print(i); //234561
            }
        }
    }


