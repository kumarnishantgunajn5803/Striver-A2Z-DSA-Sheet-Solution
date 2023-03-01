package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
 */


import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i:arr)set.add(i);
        int l=0;
        for(int i:arr){
            int t=0;
            if(!set.contains(i-1)){
                while(set.contains(i)){
                    t++;
                    i++;
                }
                l=Math.max(l,t);
            }
        }

        return l;
    }
}
