import java.util.HashMap;

public class countEachChar {
    public static void main(String[] args) {
        String str="mohit";
//        char c=str.to
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            System.out.println(str);
//            count++;
//
//        }
//        System.out.println(count);


//        using hashmap
        HashMap<Character,Integer>hs=new HashMap<>();
        for(char c:str.toCharArray()){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else{
                hs.put(c,1);
            }
        }
        for(char key:hs.keySet()){
            System.out.println(key +hs.get(key));
        }
    }

}
