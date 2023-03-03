package Step_3_Solve_Problems_On_Arrays.Hard.GFG;

import java.util.ArrayList;

/*
You are given a list of integers nums where each number represents a vote to a candidate.
Return the ids of the candidates that have greater than n/3 votes, If there's not a majority vote, return -1.
 */
public class Majority_vote {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        int n1 = Integer.MIN_VALUE -100;
        int n2 = Integer.MIN_VALUE -100;
        int c1=0;
        int c2=0;
        for(int el:nums){
            if(el==n1)c1++;
            else if(el==n2)c2++;
            else if(c1==0){
                n1=el;
                c1=1;
            }
            else if(c2==0){
                n2=el;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;
        for(int el:nums){
            if(el==n1)c1++;
            if(el==n2)c2++;
        }

        int req = nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        if(c1>req && c2>req){
            list.add(n1);
            list.add(n2);
        }
        else if(c2>req){
            list.add(n2);
        }else if(c1>req){
            list.add(n1);
        }else list.add(-1);


        return list;

    }
}
