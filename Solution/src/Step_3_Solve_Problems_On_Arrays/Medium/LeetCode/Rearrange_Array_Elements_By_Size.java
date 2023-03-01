package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;

import java.util.ArrayList;

/*
You are given a 0-indexed integer array nums of even length consisting of an equal
 number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 */
public class Rearrange_Array_Elements_By_Size {

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i:nums){
            if(i<0)neg.add(i);
            else pos.add(i);
        }
        boolean flag=true;
        int p=0;
        int n=0;
        int i=0;
        while(p<pos.size() && n<neg.size()){
            if(flag){
                arr[i++]=pos.get(p++);
                flag=false;
            }else{
                arr[i++]=neg.get(n++);
                flag=true;
            }
        }
        while(p<pos.size()){
            arr[i++]=pos.get(p++);
        }
        while(n<neg.size()){
            arr[i++]=neg.get(n++);
        }
        return arr;
    }
}
