package Learn_The_Basics.KnowBasicMathsProblems;

import java.util.Scanner;
//LeetCode Solution
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        int n = scanner.nextInt();

        ReverseNumber rn= new ReverseNumber();
        System.out.println( rn.reverse(n));
    }

    public int reverse(int x) {
        if(x==0)return 0;
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=(-1)*x;
        }
        long ans=0;
        int num=x;
        while(num!=0){
            ans*=10;
            ans+=num%10;
            num=num/10;
        }


        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)return 0;

        if(isNegative){
            return (-1)*(int)(ans);
        }
        return (int)ans;
    }
}
