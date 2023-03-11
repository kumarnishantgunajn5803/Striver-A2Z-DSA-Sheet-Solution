package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.
 */
public class Single_Element_in_a_Sorted_Array {

    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r = nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1])){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[l];
    }
}
