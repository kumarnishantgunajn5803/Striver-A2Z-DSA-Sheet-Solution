package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
Given N piles of bananas, the ith pile has piles[i] bananas and H hours time until guards return (N <= H).
 Find the minimum (S) bananas to eat per hour such that Koko can eat all the bananas within H hours.
  Each hour, Koko chooses some pile of bananas and eats S bananas from that pile. If the pile has
less than S bananas, then she consumes all of them, and wont eat any more bananas during that hour.
 */

public class Koko_Eating_Bananas {

    public static int Solve(int n, int[] piles, int h) {

        int low =1;
        int high=Integer.MIN_VALUE;
        for(int i:piles)high=Math.max(high,i);
        int ans=high;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(calculateTime(mid,piles )<=h){
                ans =Math.min(ans,mid);
                high=mid-1;
            }else low=mid+1;
        }


        return ans;

    }
    public static long calculateTime(int bananas,int[] piles ){
        long ans=0;
        for(int i:piles){
            if(i<=bananas)ans++;
            else ans+=(long)Math.ceil((double)i/bananas);
        }
        return ans;

    }
}
