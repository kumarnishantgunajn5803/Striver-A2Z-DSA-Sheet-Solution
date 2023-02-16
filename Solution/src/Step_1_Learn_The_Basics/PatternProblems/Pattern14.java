package Step_1_Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

A
AB
ABC
ABCD
ABCDE

 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern14 problem1 = new Pattern14();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {


        for(int i=0;i<n;i++){
            for(char j ='A';j<='A'+i;j++)System.out.print(j);
            System.out.println();
        }
    }

}
