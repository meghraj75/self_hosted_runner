public class ReverseNameDowhile {
    public static void main(String[] args) {
        String str="mohit";
        int index=str.length()-1;
        String reverseString=" ";

        do{
            reverseString+=str.charAt(index);
            index--;
        }while(index>=0);
        System.out.println(reverseString);
    }
}
