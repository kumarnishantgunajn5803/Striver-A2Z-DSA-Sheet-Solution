package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.Scanner;
//Given a sorted array A[] of size N, delete all the duplicated elements from A[].
// Modify the array such that if there are X distinct elements in it then the first X positions of
// the array should be filled with them in increasing order and return the number of distinct elements
// in the array.
public class Remove_Duplicate_Element_From_Sorted_Array {
    //GFG Solution

    int remove_duplicate(int A[],int N){
        int count=1;

        for(int i=0;i<N-1;i++){
            if(A[i]!=A[i+1]){
                A[count]=A[i+1];
                count++;
            }
        }
        return count;

    }
}
