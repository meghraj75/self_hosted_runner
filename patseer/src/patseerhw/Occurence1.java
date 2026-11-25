package patseerhw;
import java.util.HashMap;
import java.util.Map;

public class Occurence1 {
    public static void main(String[] args) {
        String str="Hi kalpesh how are you";

        HashMap<Character,Integer>hs=new HashMap<>();
         for(char c:str.toCharArray()){
             if(Character.isLetter(c)){
                 hs.put(c,hs.getOrDefault(c,0)+1);
             }
         }


        for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
