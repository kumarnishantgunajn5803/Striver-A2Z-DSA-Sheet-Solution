package KnowBasicMathsProblems;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int n = scanner.nextInt();
//        System.out.println( evenlyDivides(n));
        System.out.println( countDigit(n));
    }
  //GFG solution
    static int evenlyDivides(int N){
        int ans=0;
        int num=N;
        while(num>0){
            int d = num%10;
            if(d!=0 && N%d==0)ans++;

            num=num/10;
        }


        return ans;
    }

    //shotcut to count digit.
    static  int countDigit(int n){
        return (int)Math.log10(n)+1;
    }
}
