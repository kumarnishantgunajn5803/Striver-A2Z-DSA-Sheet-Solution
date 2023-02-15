package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*


 *
 * *
 * * *
 * * * *
 * * * * *


 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern2 problem1 = new Pattern2();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)System.out.print("* ");
            System.out.println();
        }
    }
}
