package patseerhw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public class Main{
//    public static void occurence(String str){
//
//        HashMap<Character, Integer> hs = new HashMap<>();
//        for (char c : str.toCharArray()) {
//            if (Character.isLetter(c)) {
//                hs.put(c, hs.getOrDefault(c, 0) + 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey());
//            }
//        }
//    }

    public static void printPrime(int n){
        int num=2;
        do{
            boolean isPrime=true;
            int i=2;
            while(i<Math.sqrt(num)){
                if(num%i==0){
                    isPrime=false;
                }
                i++;
            }
            if(isPrime){
                System.out.println(num);

            }
            num++;
        }while(num<=100);
    }
public static void extract(String str1){

    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str1.length();i++){
        char c=str1.charAt(i);
        if(Character.isDigit(c)){
            sb.append(c);
        }
    }
    System.out.println(sb);
}
public static void reverse(String str1,String str2){
    for(int i=str1.length()-1;i>=0;i--){
        str2+=str1.charAt(i);
    }
    System.out.println(str2);

}
public static void printOccurenece(String str3){
    HashMap<Character,Integer>hs=new HashMap<>();
    for(char c:str3.toCharArray()){
        if(hs.containsKey(c)){
            hs.put(c,hs.get(c)+1);
        }else{
            hs.put(c,1);
        }

    }
    for(Map.Entry<Character,Integer>e:hs.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());
    }
}

public static void duplicates(String str3) {
    HashMap<Character, Integer> hs = new HashMap<>();
    for (char c : str3.toCharArray()) {
        hs.put(c, hs.getOrDefault(c, 0) + 1);
    }
    for (char c : hs.keySet()) {
        if (hs.get(c) > 1) {
            System.out.println(c + "" + hs.get(c));
        }
    }
}

public static void dowhileReverse(){
    String str3 = "megharaj";
    String str4=" ";
    int i=str3.length()-1;
    do{
        str4+= str3.charAt(i);
        i--;

    }while(i>=0);
    System.out.println(str4);
}

public static void removeDuplicates(String str1){
    StringBuilder sb=new StringBuilder();
    HashSet<Character>hs=new HashSet<>();
    for(char c:str1.toCharArray()){
        if( hs.add(c)){
            sb.append(c);
        }

    }
    System.out.println(sb.toString());
}
public static void palindrome(){
    String name="nitin";
    String reverse=new StringBuilder(name).reverse().toString();

    String result=(name.equals(reverse)?"palidrom":"not palindrome");
    System.out.println(result);
}

public static void palindrome(int n){
    int original =n;
    int reverse=0;
    while(n>0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n/=10;
    }

    if(original==reverse){
        System.out.println("palindrome");
    }

}
public static void armstrong(){
    int n=153;
    int temp=n;
    int r,sum=0;
    while(n>0) {
        r = n % 10;
        n = n / 10;
        sum = sum + r * r * r;
    }
    if(temp==sum){
        System.out.println("armstrong");
    }else{
        System.out.println("not");
    }
}
        public static void main (String args[]){
            String str = "hi how are uou";
            String str1 = "Patseer123";
            str1 = str1.toLowerCase();
            String str2 = "";
           int arr[]={1,2,3,4,5};
           int start=0;
           int end=arr.length-1;
           while(start<end){
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end --;
           }
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
           }

           








        }


    }


