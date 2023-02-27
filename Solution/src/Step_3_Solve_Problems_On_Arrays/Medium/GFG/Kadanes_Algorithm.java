package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

public class Kadanes_Algorithm {
    long maxSubarraySum(int arr[], int n){

        long ans =arr[0];
        long sum=arr[0];
        for(int i=1;i<n;i++){
            long curr = Math.max(arr[i],arr[i]+sum);
            ans=Math.max(ans,curr);
            sum=curr;
        }
        return ans;
    }
}
