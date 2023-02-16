package Step_1_Learn_The_Basics.LearnBasicRecursion;

import java.util.Scanner;

public class SumOfFirstNTerms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        long n = scanner.nextLong();

        System.out.println(sumOfSeries( n));
    }


  //GFG Solution
   static long sumOfSeries(long N) {
        // return sum(0,N);  //parameterized way
        if(N==0)return 0;

        return N*N*N +sumOfSeries(N-1);
    }


    //parameterized way
    // static  long sum(long sum , long N){
    //     if(N==0){
    //         return sum;
    //     }

    //     return sum(N*N*N+sum , N-1);
    // }
}
