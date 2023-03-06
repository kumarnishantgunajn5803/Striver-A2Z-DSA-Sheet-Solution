package Step_3_Solve_Problems_On_Arrays.Hard.GFG;
/*
You are given an array of N integers arr, find the count of reverse pairs.

A pair of indices (i, j) is said to be a reverse pair if both the following conditions are met:

0 <= i < j < N
arr[i] > 2 * arr[j]
 */
public class Count_Reverse_Pair {
    public int countRevPairs(int N, int arr[]) {

        return mergeSort(arr,0,arr.length-1);
    }
    public int mergeSort(int[] arr, int low, int high){
        int rev=0;
        if(low<high){
            int mid = low+(high-low)/2;

            rev+=  mergeSort(arr,low,mid);
            rev+=   mergeSort(arr,mid+1,high);
            rev+=  merge(arr,low,mid,high);
        }
        return rev;
    }
    public int merge(int[] arr , int low, int mid, int high){
        int rev=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]>(2*arr[j])) j++;
            rev+=(j-(mid+1));
        }
        int[] ans = new int[high-low+1];
        int i=low;
        j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }else{

                ans[k++]=arr[j++];
            }
        }
        while(i<=mid)   ans[k++]=arr[i++];
        while(j<=high)  ans[k++]=arr[j++];

        int t = low;
        for(int l=0;l<ans.length;l++){
            arr[t++]=ans[l];
        }

        return rev;
    }


}
