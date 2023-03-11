package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point,
 the task is to find the minimum element in it.
 */
public class Minimum_element_in_a_sorted_and_rotated_array {

    int findMin(int arr[], int n){
        int ans=Integer.MAX_VALUE;

        int l=0;
        int r=n-1;
        while(l<=r){
            if(arr[l]<arr[r]){
                ans=Math.min(ans,arr[l]);
                return ans;
            }

            int mid = l+(r-l)/2;

            if(arr[l]<=arr[mid]){
                ans=Math.min(ans,arr[l]);
                l=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                r=mid-1;
            }


        }
        return ans;
    }
}
