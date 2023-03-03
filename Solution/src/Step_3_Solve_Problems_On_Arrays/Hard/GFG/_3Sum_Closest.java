package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.Arrays;

/*
Given an array A[] of N integers and an integer X. The task is to find the sum of
 three integers in A[] such that it is closest to X.


 */
public class _3Sum_Closest {

    static int closest3Sum(int nums[], int N, int X){

        Arrays.sort(nums);

        int ans=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int required = X-nums[i];
                int l=i+1;
                int h=nums.length-1;
                while(l<h){
                    int sum = nums[l]+nums[h];
                    int diff = Math.abs(sum+nums[i]-X);
                    if(diff<min){
                        min=diff;
                        ans=sum+nums[i];
                    }
                    if(sum<required){

                        l++;
                    }else{

                        h--;
                    }
                }
            }
        }

        return ans;
    }
}
