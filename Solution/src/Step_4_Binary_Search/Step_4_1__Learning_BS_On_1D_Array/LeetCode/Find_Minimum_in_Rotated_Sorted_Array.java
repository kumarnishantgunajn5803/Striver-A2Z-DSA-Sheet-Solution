package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1],
 a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
 */
public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            if(nums[l]<nums[r]){
                ans=Math.min(ans,nums[l]);
                return ans;
            }

            int mid = l+(r-l)/2;

            if(nums[l]<=nums[mid]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                r=mid-1;
            }
        }

        return ans;
    }
}
