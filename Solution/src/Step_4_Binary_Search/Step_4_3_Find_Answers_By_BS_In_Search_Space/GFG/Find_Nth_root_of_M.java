package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
You are given 2 numbers (n , m); the task is to find n√m (nth root of m).
 */
public class Find_Nth_root_of_M {
    public int NthRoot(int n, int m)
    {
        int low =1;
        int high = m;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(Math.pow(mid,n) == m )return mid;
            if(Math.pow(mid,n) < m)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

}
