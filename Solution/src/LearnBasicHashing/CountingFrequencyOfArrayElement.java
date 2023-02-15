package LearnBasicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequencyOfArrayElement {

    //GFG Solution
    public static void frequencyCount(int arr[], int N, int P)
    {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i=1;i<=N;i++){
            map.put(i,0);
        }

        for(Integer i:arr){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
        }

        int j=0;
        for(Integer i:map.keySet()){

            arr[j++]=map.get(i);
        }
    }
}
