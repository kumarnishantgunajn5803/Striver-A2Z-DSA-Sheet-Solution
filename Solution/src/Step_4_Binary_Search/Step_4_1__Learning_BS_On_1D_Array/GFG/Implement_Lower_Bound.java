package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted array arr[] of size N without duplicates, and given a value x.
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.
Find the index of K(0-based indexing).
 */
public class Implement_Lower_Bound {

    static int findFloor(long arr[], int n, long x)
    {    int ans=-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==x)return mid;
            else if(arr[mid]<x){
                ans = mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }


        return ans;
    }
}
