package KnowBasicMathsProblems;

import java.util.Scanner;

public class SumOfAlllDevisorFrom1ToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();

        System.out.println( sumOfDivisors(n));
    }
  //GFG Solution
    static long sumOfDivisors(int N){
        long ans=0;
        for(int i=1;i<=N;i++){
            ans+=(N/i)*i;
        }


        return ans;
    }
}
