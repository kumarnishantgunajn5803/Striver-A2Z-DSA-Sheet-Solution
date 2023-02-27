package Step_3_Solve_Problems_On_Arrays.Medium.GFG;
/*
Given an array A of N elements. Find the majority element in the array.
 A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 */
public class Majority_Element {
    static int majorityElement(int a[], int size){
        int c =0;
        int prev=0;



        for(int i=0;i<size;i++){
            if(c==0){
                prev=a[i];
            }
            if(prev==a[i]){
                c++;

            }else{
                c--;
            }
        }

        int count=0;
        for(int i=0;i<size;i++){
            if(a[i]==prev)count++;
        }

        if(count>size/2)return prev;
        return -1;

    }
}
