package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an array A of positive integers. Your task is to find the leaders in the array.
 An element of array is leader if it is greater than or equal to all the elements to its right side.
 The rightmost element is always a leader.
 */
public class Leaders_In_Array {

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
