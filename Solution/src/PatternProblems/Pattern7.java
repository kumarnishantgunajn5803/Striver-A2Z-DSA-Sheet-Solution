package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

        *
       ***
      *****
     *******
    *********

 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern7 problem1 = new Pattern7();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            //for space
            for(int j=0;j<n-i-1;j++)System.out.print(" ");
            //star
            for(int j=0;j<2*i+1;j++)System.out.print("*");
            //space
            // for(int j=0;j<n-i-1;j++)System.out.print(" ");

            System.out.println();
        }

    }
}
