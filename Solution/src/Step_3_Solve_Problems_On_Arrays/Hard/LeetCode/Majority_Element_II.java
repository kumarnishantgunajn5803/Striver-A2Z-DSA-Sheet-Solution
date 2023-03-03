package Step_3_Solve_Problems_On_Arrays.Hard.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
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
        List<Integer> list = new ArrayList<>();
        if(c1>req && c2>req){
            list.add(n1);
            list.add(n2);
        }
        else if(c2>req){
            list.add(n2);
        }else if(c1>req){
            list.add(n1);
        }


        return list;
    }

}
