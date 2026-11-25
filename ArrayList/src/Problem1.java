

//this is brute force approach to solve this problem this problem belongs to how much water should container store
import java.util.ArrayList;
public class Problem1 {
    public static void main(String[] args){
       ArrayList<Integer>height=new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
      System.out.println(storeWater(height));
        }
        public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater,currWater);

            }
        }
        return maxWater;
    }

}
