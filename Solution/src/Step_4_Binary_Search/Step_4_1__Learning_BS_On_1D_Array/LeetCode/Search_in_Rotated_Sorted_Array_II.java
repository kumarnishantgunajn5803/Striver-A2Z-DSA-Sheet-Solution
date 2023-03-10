package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become
  [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums,
or false if it is not in nums.

You must decrease the overall operation steps as much as possible.
 */
public class Search_in_Rotated_Sorted_Array_II {

    public boolean search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            //if we found our target return mid;
            if(nums[mid]==target)return true;

            //for duplicate element we can check
            if(nums[mid]==nums[l] && nums[mid]==nums[h]){
                l++;
                h--;
            }

            //else check if left half is sorted

            else if(nums[mid]>=nums[l]){

                //if left half is sorted and target lies in between left and mid so make h=mid-1
                if(nums[l]<=target && target<=nums[mid]){
                    h=mid-1;
                }

                else{
                    l=mid+1;
                }
            }
            // else right  half is sorted
            else{
                //  if right half is sorted and target lies in between mid and high so make l=mid+1
                if(nums[h]>=target && target>=nums[mid]){

                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return false;
    }
}
