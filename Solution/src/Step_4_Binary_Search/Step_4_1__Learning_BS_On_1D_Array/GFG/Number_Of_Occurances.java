package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.
 */
public class Number_Of_Occurances {

    int[] arr;
    int x ;
    int count(int[] arr, int n, int x) {
        this.arr=arr;
        this.x=x;

        int ans=0;
        int i1=findCount(true);

        int i2=findCount(false);

        if(i1!=-1 && i2!=-1)ans+=i2-i1+1;
        return ans;

    }
    public int findCount(boolean isFirst){

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
