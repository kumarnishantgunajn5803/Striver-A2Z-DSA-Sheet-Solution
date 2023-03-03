package Step_3_Solve_Problems_On_Arrays.Hard.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int required = 0-nums[i];
                int l=i+1;
                int h=nums.length-1;
                while(l<h){
                    int sum = nums[l]+nums[h];
                    if(sum==required){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[l]);
                        ans.add(nums[h]);
                        list.add(ans);

                        while(l<h && nums[l]==nums[l+1] ) l++;
                        while(l<h && nums[h]==nums[h-1])h--;

                        l++;
                        h--;
                    }else if(sum<required){
                        l++;
                    }else{
                        h--;
                    }
                }
            }
        }

        return list;
    }
}
