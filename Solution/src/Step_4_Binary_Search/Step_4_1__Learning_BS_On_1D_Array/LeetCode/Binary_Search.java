package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.


 */
public class Binary_Search {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;


        while(low<=high){
            int mid = low +( high-low)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
