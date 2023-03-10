package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted and rotated array A of N elements which is rotated at some point, and may
 contain duplicates and given an element key. Check whether the key exist in the array A or not.
 */
public class Search_in_Rotated_Array_2 {
    public static boolean Search(int n, int[] A, int key) {
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            //   System.out.println(mid);
            if(A[mid]==key)return true;

            if(A[mid]==A[l] && A[mid]==A[h]){
                l++;
                h--;
            }
            //check if left half is sorted
            else if(  A[mid] >= A[l]  ){


                if(key>=A[l] && key<=A[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }

            }else {
                if(key>=A[mid] && key<=A[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }

        }
        return false;
    }
}
