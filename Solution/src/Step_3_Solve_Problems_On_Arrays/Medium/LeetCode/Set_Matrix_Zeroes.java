package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */
public class Set_Matrix_Zeroes {
    //brute force (T.C - O(n*m)*(n+m)) S.C - O(1)
    // public void setZeroes(int[][] matrix) {
    //     int r = matrix.length;
    //     int c = matrix[0].length;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==0){

    //               for(int k=0;k<r;k++){
    //                   if(matrix[k][j]!=0)
    //                   matrix[k][j]=Integer.MIN_VALUE-100;
    //               }
    //               for(int k=0;k<c;k++){
    //                    if(matrix[i][k]!=0)
    //                   matrix[i][k]=Integer.MIN_VALUE-100;
    //               }
    //             }
    //         }
    //     }
    //      for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==Integer.MIN_VALUE-100){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    // }
    //Better (T.C - O(2(n*m)) ) S.C - O(n+m)
    // public void setZeroes(int[][] matrix) {
    //       int r = matrix.length;
    //        int c = matrix[0].length;
    //     int[] row = new int[r];
    //     int[] col = new int[c];
    //         for(int i=0;i<matrix.length;i++){
    //             for(int j=0;j<matrix[0].length;j++){
    //                 if(matrix[i][j]==0){
    //                     row[i]=-1;
    //                     col[j]=-1;
    //                 }
    //             }
    //          }
    //           for(int i=0;i<matrix.length;i++){
    //             for(int j=0;j<matrix[0].length;j++){
    //                 if(row[i]==-1 || col[j]==-1){
    //                     matrix[i][j]=0;
    //                 }
    //             }
    //          }

    // }
    //Optimized
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean col =false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0) col = true;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                    matrix[i][0]= matrix[0][j]=0;
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>0;j--){
                if( matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }

            }
            if(col)matrix[i][0]=0;
        }

    }
}
