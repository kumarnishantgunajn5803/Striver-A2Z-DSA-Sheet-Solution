package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.ArrayList;
import java.util.Arrays;
/*
Given an array of integers and another number. Find all the unique
 quadruple from the given array that sums up to the given number.
 */
public class Find_All_Four_Sum_Numbers {

    public ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long req =target-(long)(nums[i]+nums[j]);
                int left=j+1;
                int right =n-1;
                while(left<right){
                    long sum = nums[left]+nums[right];
                    if(sum<req)left++;
                    if(sum>req)right--;

                    if(sum==req){
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        list.add(quad);

                        while(left<right && nums[left]==nums[left+1])left++;
                        while(left<right && nums[right]==nums[right-1])right--;

                        left++;
                        right--;
                    }
                }
                while(j+1<n && nums[j]==nums[j+1])j++;
            }
            while(i+1<n && nums[i]==nums[i+1])i++;
        }


        return list;
    }
}
