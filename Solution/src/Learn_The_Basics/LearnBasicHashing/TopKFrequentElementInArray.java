package Learn_The_Basics.LearnBasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TopKFrequentElementInArray {


    //GFG Solution
    public int[] topK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList< Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> Objects.equals(a.getValue(), b.getValue())? b.getKey()-a.getKey():b.getValue()-a.getValue());

        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }

        //   System.out.println(list);
        return ans;
    }
}
