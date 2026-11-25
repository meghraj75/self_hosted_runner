public class RotationOfStr {
    public static boolean isRotation(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2){
            System.out.println("not equal");
            return false;
        }
        else{
            System.out.println("called");
            String temp=s1+s1;
            return temp.contains(s2);

        }

    }
    public static void main(String[] args) {
        String s1="ABACD";
        String s2="CDABA";
        System.out.println(isRotation(s1,s2));
    }
}
