package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
You are given an array of integers nums and an integer K,
your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it,
the sum of the division's result is less than or equal to the given integer K.
Each result of the division is rounded to the nearest integer greater than or equal to that element.
For Example: 7/3 = 3.
 */
public class Smallest_Divisor {
    public static int smallestDivisor(int[] nums, int K) {
        int low=0,mid=0;

        int high=Integer.MAX_VALUE;

        int n=nums.length;

        while(low<=high){

            mid=low+(high-low)/2;

            int h=0;

            for(int i=0;i<n;i++){

                h+=Math.ceil(1.0*nums[i]/mid);

            }

            if(h>K){low=mid+1;}

            else high=mid-1;

        }

        return low;
    }
}
