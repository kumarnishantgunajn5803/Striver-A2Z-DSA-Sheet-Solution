package Step_2_Learn_Important_Sorting_Techniques.Sorting_II;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {11,2,13,41,5};
       Merge_Sort merge_sort = new Merge_Sort();

        merge_sort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    void merge(int arr[], int l, int m, int r)
    {
        int[] ans = new int[r-l+1];

        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r ){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
            }
        }

        while(i<=m){

            ans[k++]=arr[i++];
        }

        while(j<=r){
            ans[k++]=arr[j++];
        }

        int t = l;
        for(int f=0;f<ans.length;f++){
            arr[t++]=ans[f];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r)return;

        int mid= l+(r-l)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
