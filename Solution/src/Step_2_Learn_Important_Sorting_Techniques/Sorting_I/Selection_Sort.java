package Step_2_Learn_Important_Sorting_Techniques.Sorting_I;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {11,2,13,41,5};
        Selection_Sort selection_sort = new Selection_Sort();
        selection_sort.selectionSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    //GFG solution
    int  select(int arr[], int i){

        int n=arr.length;
        int min=i;
        for(int j=i;j<n;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        return min;
    }

    void selectionSort(int arr[], int n){

        for(int i=0;i<n-1;i++){
            int min= select(arr,i);
            swap(arr,i,min);
        }
    }

    void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp ;
    }
}
