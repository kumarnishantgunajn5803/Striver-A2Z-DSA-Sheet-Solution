package Step_3_Solve_Problems_On_Arrays.Medium.GFG;
/*
Given a matrix of  size n x m. Your task is to make Zeroes, that means in whole matrix when you find a zero,
convert its upper, lower, left, and right value to zero and make that element the sum of the upper, lower, left
and right value. Do the following tasks according to the initial matrix.
 */
public class Make_Zeroes {
    public void  MakeZeros(int[][] matrix)
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    int sum=0;
                    if(i>0 ){
                        sum+=matrix[i-1][j];
                        mat[i-1][j]=-1;
                    }
                    if(i<r-1){
                        sum+=matrix[i+1][j];
                        mat[i+1][j]=-1;
                    }
                    if(j>0){
                        sum+=matrix[i][j-1];
                        mat[i][j-1]=-1;
                    }
                    if(j<c-1){
                        sum+=matrix[i][j+1];
                        mat[i][j+1]=-1;
                    }

                    mat[i][j]=sum;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==-1)
                    matrix[i][j]=0;
                if(mat[i][j]!=0 && mat[i][j]!=-1) matrix[i][j]=mat[i][j];
            }
        }

    }
}
