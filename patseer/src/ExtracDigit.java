public class ExtracDigit {
    public static void main(String[] args) {
        String str="patseer123";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        System.out.println(sb.toString());

    }
}
