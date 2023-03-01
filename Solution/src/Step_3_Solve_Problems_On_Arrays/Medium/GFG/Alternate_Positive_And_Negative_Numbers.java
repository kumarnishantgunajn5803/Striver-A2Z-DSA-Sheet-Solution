package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

import java.util.ArrayList;

/*
Given an unsorted array Arr of N positive and negative numbers.
 Your task is to create an array of alternate positive and negative numbers without changing
  the relative order of positive and negative numbers.
Note: Array should start with a positive number.

 */
public class Alternate_Positive_And_Negative_Numbers {
    void rearrange(int arr[], int m) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i:arr){
            if(i<0)neg.add(i);
            else pos.add(i);
        }
        boolean flag=true;
        int p=0;
        int n=0;
        int i=0;
        while(p<pos.size() && n<neg.size()){
            if(flag){
                arr[i++]=pos.get(p++);
                flag=false;
            }else{
                arr[i++]=neg.get(n++);
                flag=true;
            }
        }
        while(p<pos.size()){
            arr[i++]=pos.get(p++);
        }
        while(n<neg.size()){
            arr[i++]=neg.get(n++);
        }
    }
}
