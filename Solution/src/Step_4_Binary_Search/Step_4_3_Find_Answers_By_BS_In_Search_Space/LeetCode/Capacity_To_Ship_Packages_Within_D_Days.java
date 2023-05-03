package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;
/*
A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day,
we load the ship with packages on the conveyor belt (in the order given by weights).
We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all
the packages on the conveyor belt being shipped within days days.


 */
public class Capacity_To_Ship_Packages_Within_D_Days {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int i:weights){
            l=Math.max(l,i);
            r+=i;
        }

        while(l<r){
            int mid = l+(r-l)/2;
            int daysNeed=1;
            int currWeight=0;
            for(int w:weights){
                if(currWeight + w >mid){
                    daysNeed++;
                    currWeight=0;
                }
                currWeight+=w;
            }

            if(daysNeed > days) l = mid+1;
            else r=mid;
        }

        return l;
    }
}
