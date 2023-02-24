package Step_3_Solve_Problems_On_Arrays.Easy;
/*
//GFG


Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order,
 and a number X is given. The task is to find whether element X is present in the matrix or not.


 */
public class SearchInAMatrix {
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int res=0;
        int i=0;
        int j=M-1;
        while(i<N && j>=0){
            if(mat[i][j] == X)res=1;

            if(mat[i][j]<X) i++;
            else j--;
        }


        return res;
    }
}
