public class Square {



        public static void main(String[] args) {
            int arr[]={1,2,3};
            int temps[]=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                temps[i]=arr[i]*arr[i];
            }
            int i=0;
            while(i<temps.length){
                int correct=temps[i]-1;
                if(temps[i]!=temps[correct]){
                    int temp=temps[i];
                    temps[i]=correct;
                    correct=temp;
                }

            }
            for(int a:temps){
                System.out.println(a);
            }
        }
    }

