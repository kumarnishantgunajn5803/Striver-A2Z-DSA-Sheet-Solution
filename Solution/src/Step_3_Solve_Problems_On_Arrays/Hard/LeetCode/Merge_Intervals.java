package Step_3_Solve_Problems_On_Arrays.Hard.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping
 intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
public class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        int s = intervals[0][0];
        int e = intervals[0][1];

        for(int[] arr:intervals){
            if(e>=arr[0]){
                e=Math.max(e,arr[1]);
            }else{
                res.add(new int[]{s,e});
                s=arr[0];
                e=arr[1];
            }
        }
        res.add(new int[]{s,e});
        return res.toArray(new int[res.size()][2]);
    }
}
