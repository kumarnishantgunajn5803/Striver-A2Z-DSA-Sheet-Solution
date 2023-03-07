package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;

public class Check_If_Array_Is_Sorted {

    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])return false;
        }

        return true;
    }
}
