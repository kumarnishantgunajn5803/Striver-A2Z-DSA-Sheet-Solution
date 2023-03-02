package Step_3_Solve_Problems_On_Arrays.Medium.GFG;
/*
Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction
 without using any extra space.
 */
public class Rotate_By_90_degree {
    static void rotateby90(int matrix[][], int n)
    {
        int r = matrix.length;
        int c = matrix[0].length;

        // Reverse Each row
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][c-1-j];
                matrix[i][c-1-j]=temp;
            }
        }

        //transpose the matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
