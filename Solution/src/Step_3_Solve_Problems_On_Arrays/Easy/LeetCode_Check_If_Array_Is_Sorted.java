package Step_3_Solve_Problems_On_Arrays.Easy;

/*
*Given an array nums, return true if the array was originally sorted in non-decreasing order,
* then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such
* that A[i] == B[(i+x) % A.length], where % is the modulo operation.


 */

import java.util.Scanner;

public class LeetCode_Check_If_Array_Is_Sorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }


        boolean res =check(arr,n);
        System.out.println(res);
    }

    public static boolean check(int[] arr , int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>arr[(i+1)%n]) count++;
        }

        return  count>1?false:true;
    }
}
