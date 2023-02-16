package Step_1_Learn_The_Basics.KnowBasicMathsProblems;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();

        System.out.println( armstrongNumber(n));
    }
 //GFG Solution
    static String armstrongNumber(int n){
        int armNo = 0;

        int num=n;
        while(num>0){
            armNo+=Math.pow(num%10,3);
            num=num/10;
        }
        if(armNo==n)return "Yes";
        return "No";
    }
}
