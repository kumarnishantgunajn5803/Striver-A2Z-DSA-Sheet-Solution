package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.LeetCode;
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and
ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class First_And_Last_Position_Of_An_Element_In_A_Sorted_Array {

 //Approach 1

    // public int[] searchRange(int[] arr, int x) {
    //     int n=arr.length;
    //      int i1=-1;
    //      int i2=-1;
    //     int i=0;
    //     int j=n-1;
    //     while(i<=j){
    //         int mid =i+(j-i)/2;
    //         if(arr[mid]==x){
    //            i1=mid;
    //            i2=mid;
    //            int k=mid;
    //            int l=mid;
    //            while(k>=0 && arr[k] == x){
    //               k--;
    //            }
    //            i1=k+1;
    //            while(l<n && arr[l]==x){
    //                l++;
    //            }
    //            i2=l-1;
    //            break;
    //         }
    //         else if(arr[mid]<x){
    //             i=mid+1;
    //         }else{
    //             j=mid-1;
    //         }
    //     }
    //    int[] ans = new int[2];
    //     ans[0]=i1;
    //     ans[1]=i2;


    //     return ans;
    // }
    int[] arr;
    int x;
    public int[] searchRange(int[] arr, int x) {
        this.arr=arr;
        this.x=x;

        int i1=findIndex(true);
        int i2=findIndex(false);


        int[] ans = new int[2];
        ans[0]=i1;
        ans[1]=i2;


        return ans;
    }
    public int findIndex(boolean isFirst){
        int ans=-1;
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid =i+(j-i)/2;
            if(arr[mid]==x){
                ans=mid;
                if(isFirst)j=mid-1;
                else i=mid+1;
            }
            else if(arr[mid]<x){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }

        return ans;
    }
}
