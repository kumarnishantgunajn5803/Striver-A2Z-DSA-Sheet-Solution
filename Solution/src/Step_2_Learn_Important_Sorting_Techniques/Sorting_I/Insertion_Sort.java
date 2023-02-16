package Step_2_Learn_Important_Sorting_Techniques.Sorting_I;

import java.util.Arrays;

public class Insertion_Sort {

    public static void main(String[] args) {
        int[] arr = {11,2,13,41,5};

        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void insert(int arr[],int i){
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            swap(arr,j,j-1);
            j--;
        }

    }
    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            insert(arr,i);
        }
    }

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
