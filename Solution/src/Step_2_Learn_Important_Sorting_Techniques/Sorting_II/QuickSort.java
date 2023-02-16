package Step_2_Learn_Important_Sorting_Techniques.Sorting_II;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number:-");
            int n=s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            System.out.println("Before sorting");
            System.out.println(Arrays.toString(arr));

             quickSort(arr,0,n-1);
            System.out.println("after sorting");
            System.out.println(Arrays.toString(arr));
        }


    public static void quickSort(int[] arr , int l , int h) {
        if(l>=h)return;

        int pivot = partition(arr,l,h);
        quickSort(arr,l,pivot-1);
        quickSort(arr,pivot+1,h);

    }

    private static int partition(int[] arr, int l, int h) {
         int pivot = arr[h];
         int i=l-1;

         for(int j=l;j<h;j++){
             if(arr[j]<=pivot){
                 i++;
                 swap(arr,i,j);
             }
         }

         swap(arr,i+1,h);
         return i+1;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
