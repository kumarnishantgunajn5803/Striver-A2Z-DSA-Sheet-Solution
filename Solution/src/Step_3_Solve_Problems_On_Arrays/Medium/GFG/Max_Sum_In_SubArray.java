package Step_3_Solve_Problems_On_Arrays.Medium.GFG;
/*
Given an array, find maximum sum of smallest and second smallest elements chosen from all possible sub-arrays.
 More formally, if we write all (nC2) sub-arrays of arrayof size >=2 and find the sum of smallest and second
 smallest, then our answer will be maximum sum among them.
 */
public class Max_Sum_In_SubArray {

    public static long pairWithMaxSum(long arr[], long N){

        long max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            max =Math.max(max,arr[i]+arr[i+1]);
        }

        return max;
    }
}
