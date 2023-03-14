package Step_4_Binary_Search.Step_4_2__Learning_BS_On_2D_Array.LeetCode;
/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
 */
public class Search_a_2D_Matrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int l=0;
        int h=r*c-1;

        while(l<=h){
            int mid = l+(h-l/2);

            if(matrix[mid/c][mid%c]==target)return true;

            if(matrix[mid/c][mid%c]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return false;
    }
}
