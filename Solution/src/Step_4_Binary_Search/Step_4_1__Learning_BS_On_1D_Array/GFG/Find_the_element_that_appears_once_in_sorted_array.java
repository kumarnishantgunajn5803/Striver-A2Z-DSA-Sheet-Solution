package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted array arr[] of size N. Find the element that appears only once in the array.
All other elements appear exactly twice.
 */
public class Find_the_element_that_appears_once_in_sorted_array {

    int findOnce(int arr[], int n){

        int l=0;
        int r=n-1;

        while(l<r){
            int mid = l+(r-l)/2;

            if((mid%2==0 && arr[mid+1]==arr[mid] )|| (mid%2!=0 && arr[mid-1]==arr[mid])){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return arr[l];
    }
}
