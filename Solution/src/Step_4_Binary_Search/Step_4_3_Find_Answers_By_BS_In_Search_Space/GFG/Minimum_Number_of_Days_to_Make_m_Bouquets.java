package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
To make one bouquet we need K adjacent flowers from the garden.
 Here the garden consists of N different flowers, the ith flower will bloom in the bloomDay[i].
 Each flower can be used inside only one bouquets. We have to find the minimum number of days need to
 wait to make M bouquets from the garden. If we cannot make m bouquets, then return -1.

The first line of input contains two integers M and K.
The second line contains N space-separated integers of bloomDay[i] array.
 */
public class Minimum_Number_of_Days_to_Make_m_Bouquets {

    public static int solve(int M, int K, int[] bloomDay) {
        if((long)M*K > bloomDay.length)return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int d:bloomDay){
            low=Math.min(d,low);
            high=Math.max(d,high);
        }

        while(low<high){
            int mid = low+(high-low)/2;
            if(getNumberOfBouquet(bloomDay,mid,K) < M){
                low=mid+1;
            }else high=mid;
        }

        return low;

    }
    public static int getNumberOfBouquet(int[] bloomDay, int days, int k){
        int bouquet=0,collectedFlowers=0;
        for(int d:bloomDay){
            if(d<=days)collectedFlowers++;
            else collectedFlowers=0;
            if(collectedFlowers==k){
                bouquet++;
                collectedFlowers=0;
            }

        }


        return bouquet;
    }
}
