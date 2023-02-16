package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Larget_Element_In_The_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Larget_Element_In_The_Array  larget_element_in_the_array = new Larget_Element_In_The_Array();
       int ans = larget_element_in_the_array.largest(arr,n);
        System.out.println(ans);

    }

    //GFG Solution
    public   int largest(int arr[], int n){
        int max=-1;
        for(Integer i:arr) max = max<i?i:max;


        return max;

    }
}
