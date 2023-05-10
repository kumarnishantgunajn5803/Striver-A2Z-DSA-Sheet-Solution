package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.GFG;
/*
You have N books, each with Ai number of pages.
 M students need to be allocated contiguous books, with each student getting at least one book.
  Out of all the permutations, the goal is to find the permutation where the student with the most
   pages allocated to him gets the minimum number of pages, out of all possible permutations.

Note: Return -1 if a valid assignment is not possible, and allotment should be in
 contiguous order (see the explanation for better understanding).
 */
public class Book_Allocation_Problem {
    static int[] arr;
    static int students;
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(N<M)return -1;
        arr=A;
        students=M;
        int high=0,low=A[0];
        int res=-1;
        for(int i=0;i<N;i++){
            low=Math.min(low,A[i]);
            high+=A[i];
        }

        while(low<=high){
            int mid = (low+high) >> 1;
            if(allocationIsPossible(mid )){
                res=mid;
                high=mid-1;
            }else
                low=mid+1;

        }

        return res;

    }
    public static boolean allocationIsPossible(int barrier ){
        int allocatedStudents=1;
        long pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>barrier)return false;
            if(pages+arr[i] >barrier){
                allocatedStudents++;
                pages=arr[i];
            }else pages+=arr[i];
        }

        if(allocatedStudents > students )return false;
        return true;
    }
}
