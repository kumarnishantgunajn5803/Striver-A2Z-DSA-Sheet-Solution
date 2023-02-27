package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;

public class Maximum_subarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            int currSum = Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,currSum);
            sum=currSum;
        }
        return max;
    }
}
