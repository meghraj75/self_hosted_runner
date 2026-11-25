import java.util.Scanner;
public class Sum {
    static int sum(){
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a num1");
       int num1=sc.nextInt();

       System.out.println("enter a num2");
       int num2=sc.nextInt();

       int sum2=num1+num2;
       return sum2;

    }
    public static void main(String args[]){
        int ans=sum();
        System.out.println(ans);
    }



}

