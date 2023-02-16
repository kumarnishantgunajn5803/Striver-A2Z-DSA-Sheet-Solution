package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.Scanner;

public class Check_If_Array_Is_Sorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        Check_If_Array_Is_Sorted sorted = new Check_If_Array_Is_Sorted();
        boolean res = sorted.arraySortedOrNot(arr,n);
        System.out.println(res);
    }

    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])return false;
        }

        return true;
    }
}
