package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern19 problem1 = new Pattern19();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");


            }
            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");


            }
            System.out.println();
        }
    }

}
