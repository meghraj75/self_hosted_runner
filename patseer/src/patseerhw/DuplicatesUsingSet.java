package patseerhw;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesUsingSet {
    public static void main(String[] args) {
        String str="java";
        StringBuilder sb=new StringBuilder();
        char c[]=str.toCharArray();
        Set<Character>set=new LinkedHashSet<>();
        for(int i=0;i<c.length;i++){
            set.add(str.charAt(i));
        }

        for(Character c1:set){
            sb.append(c1);
        }
        System.out.println(sb);
    }
}
