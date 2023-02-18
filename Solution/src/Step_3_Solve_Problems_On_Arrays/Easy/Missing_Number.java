package Step_3_Solve_Problems_On_Arrays.Easy;
import java.util.*;

public class Missing_Number {

    public static int missingNumber(int A[], int N){

        int requiredSum=N*(N+1)/2;

        int sum=0;
        for(Integer i:A)sum+=i;
        return requiredSum-sum;

    }
}
