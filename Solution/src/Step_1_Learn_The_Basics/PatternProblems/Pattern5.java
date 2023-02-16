package Step_1_Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern5 problem1 = new Pattern5();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++)System.out.print("* ");
            System.out.println();
        }
    }
}
