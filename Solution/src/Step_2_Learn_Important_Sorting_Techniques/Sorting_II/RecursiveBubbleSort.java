package Step_2_Learn_Important_Sorting_Techniques.Sorting_II;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

//        recursiveBubblesort(arr,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }


    //approach 1
    public static void recursiveBubblesort(int[] arr , int l ){
        if(l==0)return;

        for(int j=0;j<l;j++){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
        }

        recursiveBubblesort(arr,l-1);


    }
    //approach 2 (gives stack overflow error)

    public static  void bubbleSort(int[] arr, int l , int j){
        if(l==0)return;

         if(j<l){
             if(arr[j]>arr[j+1])swap(arr,j,j+1);
             j++;
             bubbleSort(arr,l,j);
         }else{
             bubbleSort(arr, l-1,0);
         }
    }

    public static void swap(int[] arr , int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
