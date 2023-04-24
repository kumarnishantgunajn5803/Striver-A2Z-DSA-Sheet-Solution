package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;
/*
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor,
 divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned
  above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element.
 (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.
 */
public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = (int)1e6;

        while(left<right){
            int sum=0;
            int mid = (left+right)/2;
            for(int i:nums){
                sum+=(i+mid-1)/mid;
            }
            if(sum>threshold)left=mid+1;
            else right=mid;
        }
        return left;
    }
}
