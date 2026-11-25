import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        String str="aabdcc";
        HashMap<Character,Integer>hs=new HashMap<>();

        for(char c:str.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }

        System.out.println("duplicates");
        for (char key:hs.keySet()){
            if(hs.get(key)>1){
                System.out.println(hs.get(key));
            }
        }

        
    }
}
