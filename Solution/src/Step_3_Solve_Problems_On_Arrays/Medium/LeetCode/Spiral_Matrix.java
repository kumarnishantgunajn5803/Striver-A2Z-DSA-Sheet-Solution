package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //left pointer
        int l=0;
        //right pointer
        int r = matrix[0].length-1;
        //top pointer
        int t=0;
        //bottom Pointer
        int b=matrix.length-1;
        List<Integer> ans = new ArrayList<>();
        //direction in to traverse according to question.
        int dir=0;
        // check l<=r and  t<=b
        while(l<=r && t<=b){
            //if direction is 0, it means we are going from left to right and the row we will be traversing is top row.
            if(dir==0){
                for(int i=l;i<=r;i++){
                    ans.add(matrix[t][i]);
                }
                //since we have traversed top row, therefore we will increment it.
                t++;
            }
//similarly for top to bottom and here columm will be fixed that is right column.
            if(dir==1){
                for(int i=t;i<=b;i++){
                    ans.add(matrix[i][r]);
                }
                //since we have traversed right column, therefore we will decrement it.
                r--;
            }
            // if direction is from right to left, row will be fixed that is it will be bottom row.
            if(dir==2){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
                //after traversing bottom row we will decrement it.
                b--;
            }
            //if the direction is from bottom to top, column will be fixed that is it will be left column.
            if(dir==3){
                for(int i=b;i>=t;i--){
                    ans.add(matrix[i][l]);
                }
                //after traversing left column we will increment it.
                l++;
            }
            //this is very important condition, since we have to traverse in four direction(ex:- when direction will be 4 then next we need to traverse top again and for that we need direction ==0; so if we will find modulo of 4%4 i.e=0;)
            dir=(dir+1)%4;
        }

        return ans;
    }
}
