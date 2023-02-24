package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    // Function for finding maximum and value pair
    //Brute Force (o(n^2))
    // public static int lenOfLongSubarr (int A[], int N, int K) {
    //     int max=0;

    //      for(int i=0;i<N;i++){
    //          int sum=0;
    //          for(int j=i;j<N;j++){
    //             sum+=A[j];
    //             if(sum==K){
    //                 max=Math.max(max,j-i+1);
    //             }
    //          }
    //      }

    //      return max;
    // }


    //2nd approach prefix sum
    // O(nlogn)

    public static int lenOfLongSubarr (int A[], int N, int K) {
        int max=-1;
        Map<Integer, Integer> map = new HashMap<>();

        int sum=0;
        for(int i=0;i<N;i++){

            sum+=A[i];
            if(sum==K){
                max=Math.max(max,i+1);
            }

            if(map.containsKey(sum-K)){
                max=Math.max(max,(i-map.get(sum-K)));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }


        }

        if(max==-1)return 0;




        return max;
    }

}
