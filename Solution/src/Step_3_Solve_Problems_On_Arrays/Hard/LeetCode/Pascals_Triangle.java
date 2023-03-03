package Step_3_Solve_Problems_On_Arrays.Hard.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above
 */
public class Pascals_Triangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> prev = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(1);
                }
                else  curr.add(prev.get(j-1)+prev.get(j));


            }

            prev=curr;
            list.add(curr);
        }

        return list;

    }
}
