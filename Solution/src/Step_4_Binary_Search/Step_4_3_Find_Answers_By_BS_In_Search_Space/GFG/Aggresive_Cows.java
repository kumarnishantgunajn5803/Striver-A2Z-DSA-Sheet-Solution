package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;

import java.util.Arrays;

/*
You are given an array consisting of n integers which denote the position of a stall.
You are also given an integer k which denotes the number of aggressive cows.
 You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
The first line of input contains two space-separated integers n and k.
The second line contains n space-separated integers denoting the position of the stalls.
 */
public class Aggresive_Cows {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int ans=0;
        int l=1, h=stalls[n-1]-stalls[0];
        while(l<=h){
            int mid = (l+h) >> 1;
            //   System.out.println(mid);
            if(canPlaceCows(n,k,stalls,mid)){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;

        }

        return ans;
    }
    public static boolean canPlaceCows(int n, int k, int[] arr,int dist){
        int lastPosition=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]-lastPosition >=dist){
                count++;
                lastPosition=arr[i];

            }

            if(count==k)return true;
        }

        return false;
    }
}
