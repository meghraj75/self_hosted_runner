import java.util.HashMap;
import java.util.Map;

public class Occurence {

    public static void main(String[] args) {
        String str="Hi Kalpesh, How are you";
        str=str.toLowerCase();

        HashMap<Character,Integer>hs=new HashMap<>();

        for(char c:str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
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
