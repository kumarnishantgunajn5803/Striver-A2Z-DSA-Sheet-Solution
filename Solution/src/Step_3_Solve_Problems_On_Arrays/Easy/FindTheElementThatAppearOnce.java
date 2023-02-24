package Step_3_Solve_Problems_On_Arrays.Easy;



/*
Given a sorted array A[] of N positive integers having all the numbers
 occurring exactly twice, except for one number which will occur only once.
  Find the number occurring only once.
 */
public class FindTheElementThatAppearOnce {


    //GFG SOlution
    public static int search(int A[], int N){
        int l=0;
        int h = N-1;
        while(l<h){
            int mid = l +(h-l)/2;
            if((mid%2==0 && A[mid+1]==A[mid])   || (mid%2!=0 && A[mid-1]==A[mid])){
                l=mid+1;
            } else{
                h=mid;
            }
        }
        return A[l];

    }
}
