package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSingleNumber {
    /*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
     */

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(Integer i:nums){
            set.add(i);
            sum+=i;
        }
        int required = 0;
        for(Integer i:set){
            required +=i;
        }

        required =2*required;

        return required-sum;


    }
}
