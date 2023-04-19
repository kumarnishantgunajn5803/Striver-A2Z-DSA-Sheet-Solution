package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
 */
public class Square_root_of_a_number {
    long floorSqrt(long x)
    {
        long low =1;
        long high =x;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(mid*mid==x)return mid;
            if(mid*mid <x) low=mid+1;
            else high=mid-1;

        }
        return high;

    }
}
