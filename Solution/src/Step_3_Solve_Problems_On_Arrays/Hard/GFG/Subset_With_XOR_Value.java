package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

public class Subset_With_XOR_Value {

    static int helper(int []arr,int n,int k){
        if(n==0){
            if(k==0)
                return 1;
            else
                return 0;
        }
        int taken = helper(arr,n-1,k^arr[n-1]);
        int notTaken = helper(arr,n-1,k);
        return taken+notTaken;
    }
    static int subsetXOR(int arr[], int N, int K) {
        return helper(arr,N,K);
    }
}
