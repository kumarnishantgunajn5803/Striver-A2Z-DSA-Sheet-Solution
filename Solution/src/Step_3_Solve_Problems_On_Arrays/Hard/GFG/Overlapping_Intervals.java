package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a collection of Intervals, the task is to merge all of the overlapping Intervals.
 */
public class Overlapping_Intervals {

    public int[][] overlappedInterval(int[][] Intervals){
        List<int[] > res = new ArrayList<>();
        Arrays.sort(Intervals, (a, b)->a[0]-b[0]);

        int s = Intervals[0][0];
        int e = Intervals[0][1];

        for(int[] arr:Intervals){
            if(e>=arr[0]){
                e=Math.max(e,arr[1]);
            }else{
                res.add(new int[]{s,e});
                s=arr[0];
                e=arr[1];
            }
        }

        res.add(new int[]{s,e});

        return res.toArray(new int[0][]);


    }
}
