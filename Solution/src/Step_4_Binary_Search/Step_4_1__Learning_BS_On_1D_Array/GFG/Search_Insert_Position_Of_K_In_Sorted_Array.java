package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k,
 the task is to find the index of k, if its present in the array Arr[].
 Otherwise, find the index where k must be inserted to keep the array sorted.
 */
public class Search_Insert_Position_Of_K_In_Sorted_Array {

    static int searchInsertK(int Arr[], int N, int k)
    {
        int i=0;
        int j=N-1;
        while(i<=j){
            int mid = i+(j-i)/2;

            if(Arr[mid]==k)return mid;

            if(Arr[mid]<k){
                i=mid+1;
            }else{
                j=mid-1;
            }

        }

        return i;
    }
}
