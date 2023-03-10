package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point,
and given an element key. The task is to find the index of the given element key in the array A.
 */
public class Search_In_A_Rotated_Array {

    int search(int A[], int l, int h, int key)
    {
        while(l<=h){
            int mid = l+(h-l)/2;
            //   System.out.println(mid);
            if(A[mid]==key)return mid;
            //check if left half is sorted
            if(  A[mid] >= A[l]  ){


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
        return -1;
    }
}
