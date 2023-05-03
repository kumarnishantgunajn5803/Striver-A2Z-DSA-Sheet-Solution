package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
Given an array arr[] of N weights. Find the least weight capacity of a boat to ship all weights within D days.
The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].
We may not load more weight than the maximum weight capacity of the ship.

Note: You have to load weights on the boat in the given order.
 */
public class Capacity_To_Ship_Packages_Within_D_Days {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        int l=0;
        int r=0;
        for(int i:arr){
            l=Math.max(l,i);
            r+=i;
        }

        while(l<r){
            int mid = l+(r-l)/2;
            int daysNeed=1;
            int currWeight=0;
            for(int w:arr){
                if(currWeight+w > mid ){
                    daysNeed++;
                    currWeight=0;
                }
                currWeight+=w;
            }

            if(daysNeed > D ) l=mid+1;
            else r=mid;
        }

        return l;
    }
}
