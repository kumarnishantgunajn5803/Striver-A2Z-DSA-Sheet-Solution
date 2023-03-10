package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always
considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
 */
public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int l =0;
        int h = nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }else h=mid;
        }

        return l;
    }
}
