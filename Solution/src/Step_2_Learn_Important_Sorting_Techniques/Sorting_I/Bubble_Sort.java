package Step_2_Learn_Important_Sorting_Techniques.Sorting_I;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {11,2,13,41,5};
         bubbleSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int arr[], int n)
    {
        for(int i=n-1;i>=0;i--){

            boolean didSwap=false;

            for(int j=0;j<i;j++){

                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap=true;
                }

            }

            if(!didSwap) break;
        }
    }


    public static void swap(int[] arr , int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
