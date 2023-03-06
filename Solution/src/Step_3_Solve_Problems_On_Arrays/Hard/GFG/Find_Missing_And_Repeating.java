package Step_3_Solve_Problems_On_Arrays.Hard.GFG;
/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, N} is
missing and one number 'B' occurs twice in array. Find these two numbers
 */
public class Find_Missing_And_Repeating {

    int[] findTwoElement(int arr[], int l) {
        long n = (long)l;
        long s = n*(n+1)/2;
        long sq = n*(n+1)*(2*n+1)/6;
        int sum =0;
        for(int i:arr){
            s-=(long)i;
            sq-=(long)i*(long)i;
        }

        long missing = (s+sq/s)/2;
        long repeating = missing-s;

        int[] ans= new int[]{(int)repeating, (int)missing};

        return ans;

    }
}
