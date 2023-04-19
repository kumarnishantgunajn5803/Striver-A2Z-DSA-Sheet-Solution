package Step_4_Binary_Search.Step_4_2__Learning_BS_On_2D_Array.GFG;
/*
Given a row wise sorted matrix of size R*C where R and C are always odd, find the median of the matrix.
 */
public class Median_in_a_row_wise_sorted_Matrix {
    int median(int matrix[][], int R, int C) {
        int low=1;
        int high =1000000000;


        while(low<=high){
            int mid = low + (high-low)/2;
            int count=0;
            for(int i=0;i<R;i++){
                count+=findCount(matrix[i],mid);
            }

            if(count <= (R*C)/2 ) low=mid+1;
            else high=mid-1;

        }
        return low;
    }

    int findCount(int[] row, int mid){
        int low =0;
        int high= row.length-1;

        while(low<=high){
            int md = low+(high-low)/2;

            if(row[md]<=mid)low=md+1;
            else high=md-1;
        }
        return low;
    }
}
