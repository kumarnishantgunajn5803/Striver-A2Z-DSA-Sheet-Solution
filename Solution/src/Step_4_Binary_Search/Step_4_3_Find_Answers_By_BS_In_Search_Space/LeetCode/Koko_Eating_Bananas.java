package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;

/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k
bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any
 more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.
 */

public class Koko_Eating_Bananas {

    class Solution {
        int[] piles;
        int hr;
        public int minEatingSpeed(int[] piles, int h) {

            this.piles=piles;
            this.hr=h;
            int low= 1; // low
            int high = Integer.MIN_VALUE; // high


            //finding maximum number of bananas amongst the given piles
            for(int i:piles){

                high=Math.max(high,i);
            }
            // In the worst case she may have to eat maximum present  (looking at the constraints ( piles.length <= h <= 109))
            int ans=high;
            // run loop
            while(low<=high){
                //find mid
                int mid =low+(high-low)/2;

                if(calculateTime(mid) <= h){

                    ans=Math.min(ans,mid);
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }

            return ans;
        }
        //method to calculate time
        public long calculateTime(int bananas){
            long ans =0;
            for(int i:piles){
                // if bananas is less than equal to the number of banans in the piles then she can eat within one hour.
                if(i<=bananas){
                    ans++;
                }else{ // otherwise she will take more time
                    ans+=(long)Math.ceil((double)i/bananas);

                }
            }

            return  ans;
        }
    }
}
