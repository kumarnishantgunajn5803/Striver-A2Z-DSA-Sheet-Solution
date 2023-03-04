package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.HashMap;
import java.util.Map;

/*
Given an array having both positive and negative integers.
The task is to compute the length of the largest subarray with sum 0.
 */
public class Largetst_Subarray_With_Sum_0 {

    int maxLen(int arr[], int n){
        int ans = 0;
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)ans=i+1;
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }

            if(!map.containsKey(sum))
                map.put( sum,i);
        }

        return ans;
    }
}
