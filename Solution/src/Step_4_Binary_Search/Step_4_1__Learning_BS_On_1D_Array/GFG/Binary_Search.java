package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted array of size N and an integer K, find the position at which K
 is present in the array using binary search.
 */
public class Binary_Search {

    int binarysearch(int arr[], int n, int k) {
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid = i+(j-i)/2;

            if(arr[mid]==k)return mid;
            else if(arr[mid]<k){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}
