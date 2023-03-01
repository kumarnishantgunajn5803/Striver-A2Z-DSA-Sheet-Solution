package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in
the subsequence are consecutive integers, the consecutive numbers can be in any order.
 */
public class Longest_Consecutive_Subsequence {

    static int findLongestConseqSubseq(int arr[], int N){
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
