package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*
        *
       * *
      * * *
     * * * *
    * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

 */
public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern9 problem1 = new Pattern9();
           System.out.println("Output :-");
          problem1.printDiamond(n);
       }
    }




    void printDiamond(int n) {
        //firstHalf
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)System.out.print(" ");
            for(int j=0;j<i+1;j++)System.out.print("* ");
            System.out.println();
        }
        //Second Half
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++)System.out.print(" ");
            for(int j=0;j<i+1;j++)System.out.print("* ");
            System.out.println();
        }
    }
}
