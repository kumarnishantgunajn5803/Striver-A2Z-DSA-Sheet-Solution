package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;

import java.util.ArrayList;

/*
Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of
 first and last occurrences of an element x in the given array.
 */
public class First_And_Last_Occurance_Of_X {


    long[] arr ;
    ArrayList<Long> find(long arr[], int n, int x){
        this.arr =arr;
        long i1 = findIndex(x,true);
        long i2 = findIndex(x,false);

        ArrayList<Long> ans = new ArrayList<>();
        ans.add(i1);
        ans.add(i2);

        return ans;
    }

    long findIndex(int x, boolean isFirstIndex){
        long ans=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid =i+(j-i)/2;
            if(arr[mid]==x){

                ans=mid;
                if(isFirstIndex)j=mid-1;
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
