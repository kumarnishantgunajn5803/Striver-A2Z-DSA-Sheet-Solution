package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

public class Count_Inversion {

    static long inversionCount(long arr[], long N) {

        return mergeSort(arr, 0, N-1);
    }
    static long mergeSort(long[] arr, long low, long high){
        long inv =0;
        if(low<high){
            long mid = low+(high-low)/2;
            inv+=mergeSort(arr,low,mid);
            inv+=mergeSort(arr,mid+1,high);
            inv+=merge(arr,low,mid,high);

        }
        return inv;
    }
    static long merge(long[]arr, long low, long mid, long high){
        long inv =0;
        long[] ans = new long[(int)(high-low+1)];
        int i=(int)low;
        int j=(int)(mid+1);
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
                inv+=mid-i+1;
            }
        }
        while(i<=mid) ans[k++]=arr[i++];
        while(j<=high)  ans[k++]=arr[j++];

        int t = (int)low;
        for(int l=0;l< ans.length;l++){
            arr[t++]=ans[l];
        }

        return inv;
    }
}
