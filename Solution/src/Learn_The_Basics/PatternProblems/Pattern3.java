package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5


 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern3 problem1 = new Pattern3();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)System.out.print(j+" ");
            System.out.println();
        }
    }
}
