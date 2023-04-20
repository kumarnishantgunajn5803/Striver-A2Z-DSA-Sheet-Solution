package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;
/*
You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in
exactly one bouquet.

Return the minimum number of days you need to wait to be able to make m bouquets from the garden.
 If it is impossible to make m bouquets return -1.
 */
public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    int[] bloomDay;
    int k;
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)return -1;
        this.bloomDay=bloomDay;
        this.k=k;
        int high=Integer.MIN_VALUE, low=Integer.MAX_VALUE;
        for(int d:bloomDay){
            low=Math.min(d,low);
            high=Math.max(d,high);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            int possibleBouquetOnCurrentDay = calculatePossibleBouquet(mid);
            if(possibleBouquetOnCurrentDay < m) low=mid+1;
            else high=mid;
        }

        return low;


    }
    public int calculatePossibleBouquet(int days){
        int bouquet=0, adjecentFlowers=0;
        for(int d:bloomDay){
            if(d<=days)adjecentFlowers++;
            else adjecentFlowers=0;

            if(adjecentFlowers==k){
                bouquet++;
                adjecentFlowers=0;
            }
        }

        return bouquet;
    }
}
