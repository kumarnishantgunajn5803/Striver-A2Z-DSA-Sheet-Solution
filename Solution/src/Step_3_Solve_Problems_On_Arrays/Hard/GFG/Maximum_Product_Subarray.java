package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

public class Maximum_Product_Subarray {

    long maxProduct(int[] arr, int n) {
        long p1=arr[0];
        long p2=arr[0];
        long res=arr[0];
        for(int i=1;i<n;i++){
            long temp = Math.max(arr[i], Math.max(p1*arr[i],p2*arr[i]));
            p2=Math.min(arr[i],Math.min(p1*arr[i],p2*arr[i]));
            p1=temp;
            res=Math.max(res,p1);
        }

        return res;
    }
}
