package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

ABCDE
ABCD
ABC
AB
A

 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern15 problem1 = new Pattern15();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        for(int i=n-1;i>=0;i--){
            for(char ch='A'; ch<'A'+i+1;ch++)System.out.print(ch);
            System.out.println();
        }
    }

}
