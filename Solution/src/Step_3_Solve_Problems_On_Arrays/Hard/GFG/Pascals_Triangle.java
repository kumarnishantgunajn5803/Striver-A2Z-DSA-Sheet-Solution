package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.ArrayList;
import java.util.List;

/*
Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up
the elements of previous row.
 */
public class Pascals_Triangle {

    ArrayList<Long> nthRowOfPascalTriangle(int numRows) {
        List<List<Long>> list = new ArrayList<List<Long>>();
        List<Long> prev = new ArrayList<>();
        ArrayList<Long> ans=null;
        for(int i=0;i<numRows;i++){
            ArrayList<Long> curr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(Long.valueOf(1));
                }
                else
                    curr.add(((long)prev.get(j-1)+ (long)prev.get(j))%1000000007);


            }
            if(i==numRows-1){
                ans=curr;
            }
            prev=curr;
            list.add(curr);
        }

        return ans;
    }


}
