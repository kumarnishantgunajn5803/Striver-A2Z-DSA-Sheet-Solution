package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
 */
public class Majority_Element {
    public int majorityElement(int[] nums) {
        int count=0;
        int prev=-1;
        for(int n :nums){
            if(count==0){
                prev=n;

            }
            if(prev==n){
                count++;
            }else{

                count--;
            }
        }

        return prev;
    }
}
