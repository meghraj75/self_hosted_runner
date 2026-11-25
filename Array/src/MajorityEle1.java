import java.util.*;

public class MajorityEle1 {
    public static int majority(int arr[]) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mp.getOrDefault(arr[i], 0);
            mp.put(arr[i], value + 1);
        }

        //find majority element
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > n / 2) {

                return it.getKey();
            }
        }
        return -1;
    }

        public static void main (String[] args){
            int arr[] = {2, 2, 3, 3, 1, 2, 2};
            System.out.println(majority(arr));

        }
    }

