package KnowBasicMathsProblems;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int n = scanner.nextInt();
//        System.out.println( evenlyDivides(n));
        System.out.println( is_palindrome(n));
    }

    //GFG Solution
    public static String is_palindrome(int n)
    {
        int z=0;
        int num=n;
        while(n>0){
            z=z*10+n%10;
            n=n/10;
        }
        if(z==num)return "Yes";
        return "No";
    }
}
