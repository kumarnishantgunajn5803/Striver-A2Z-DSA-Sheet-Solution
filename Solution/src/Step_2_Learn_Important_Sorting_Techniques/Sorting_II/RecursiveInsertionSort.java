package Step_2_Learn_Important_Sorting_Techniques.Sorting_II;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {
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

           recursiveInsertionSort(arr,n,0);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(arr));
    }

    //using two recursive function Giving stack overflow error
    public static void recursiveInsertionSort(int[] arr, int n, int i , int j ){
        if(i==n)return;

        if(j>0 && arr[j]<arr[j-1]){
            swap(arr,j,j-1);
            recursiveInsertionSort(arr,n,i,j-1);

        }else{
            int k=i+1;
            recursiveInsertionSort(arr,n,k,k);
        }
    }
    // using one recursive function working fine
    public static void recursiveInsertionSort(int[] arr, int n, int i  ){
        if(i==n)return;

          for(int j=i;j>0;j--){
              if(arr[j]<arr[j-1]) swap(arr,j,j-1);
          }

            recursiveInsertionSort(arr,n,i+1);

    }
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
