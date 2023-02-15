package Learn_The_Basics.KnowBasicMathsProblems;

import java.util.Arrays;
import java.util.Scanner;

public class GCD_LCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 1st Integer");
        Long a = scanner.nextLong();
        System.out.println("Please Enter 2nd Integer");
        Long b = scanner.nextLong();
        System.out.println(Arrays.toString(lcmAndGcd(a,b)));
    }
    //GFG Solution
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] ans = new Long[2];

        //find gcd
        Long gcd;
        Long n1=A;
        Long n2=B;
        while( A>0 && B>0){

            if(A>B) A=A%B;
            else B=B%A;
        }
        if(A==0) gcd=B;
        else gcd=A;

        Long lcm =(n1*n2)/gcd;

        ans[0]=lcm;
        ans[1]=gcd;
        return ans;
    }
}
