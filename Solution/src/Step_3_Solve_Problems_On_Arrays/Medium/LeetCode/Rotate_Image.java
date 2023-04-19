package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*e by 90 degre
You are given an n x n 2D matrix representing an image, rotate the images (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.
 */
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][c-1-j];
                matrix[i][c-1-j]=temp;
            }
        }
    }
}
