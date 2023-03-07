package Step_3_Solve_Problems_On_Arrays.Hard.LeetCode;

public class Maximum_Product_Subarray {

    public int maxProduct(int[] nums) {
        int p1=nums[0];
        int p2=nums[0];
        int res=nums[0];

        for(int j=1;j<nums.length;j++){
            int i=nums[j];
            int temp = Math.max(i,Math.max(p1*i,p2*i));
            p2 = Math.min(i,Math.min(p1*i,p2*i));
            p1=temp;

            res=Math.max(res,p1);

        }
        return res;
    }
}
