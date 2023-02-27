package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given two unsorted arrays A of size N and B of size M of distinct elements,
the task is to find all pairs from both arrays whose sum is equal to X.

Note: All pairs should be printed in increasing order of u.
 For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
(u1,v1) should be printed first else second.
 */
public class Find_All_Pair_With_A_Given_Sum {

 class pair  {
     long first, second;
     public pair(long first, long second)
     {
         this.first = first;
         this.second = second;
     }
 }


    class Solution {
        public pair[] allPairs( long A[], long B[], long N, long M, long X) {
            Arrays.sort(A);
            Arrays.sort(B);
            ArrayList<pair> list = new ArrayList<>();
            int i=0;
            int j=B.length-1;
            while(i<N && j>=0){
                long sum = A[i]+B[j];
                if(sum==X){
                    pair p = new pair(A[i],B[j]);
                    list.add(p);
                    i++;
                    j--;
                }else if(sum<X){
                    i++;
                }else{
                    j--;
                }
            }
            pair[] arr = new pair[list.size()];
            arr = list.toArray(arr);
            return arr;

        }
    }
}
