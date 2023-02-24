package Step_3_Solve_Problems_On_Arrays.Easy;
/*
Given a boolean 2D array of n x m dimensions where each row is sorted.
Find the 0-based index of the first row that has the maximum number of 1's.
 */
public class RowsWithMax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        int c = m-1;
        int max =-1;
        int  r=0;

        while(c>=0 && r<n){
            if(arr[r][c]==1){
                max=r;
                c--;
            }else{
                r++;
            }
        }
        return max;
    }
}
