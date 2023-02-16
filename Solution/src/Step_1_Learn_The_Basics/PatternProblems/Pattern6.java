package Step_1_Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern6 problem1 = new Pattern6();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
