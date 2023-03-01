package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

import java.util.ArrayList;
import java.util.List;

/*
Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater
 permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest
possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.
 */
public class Next_Permutation {
    static List<Integer> nextPermutation(int n, int arr[]){
        List<Integer> list = new ArrayList<>();
        int i=n-2;
        int indx=-1;
        while(i>=0){
            if(arr[i]<arr[i+1]){
                indx=i;
                break;
            }
            i--;
        }
        int j=n-1;
        if(indx!=-1)
            while(j>=0){
                if( arr[j]>arr[indx]){
                    swap(arr,j,indx);
                    break;
                }
                j--;
            }

        rev(arr,indx+1,n-1);
        for(int e:arr)list.add(e);
        return list;

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void rev(int[] arr , int i, int j){
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
