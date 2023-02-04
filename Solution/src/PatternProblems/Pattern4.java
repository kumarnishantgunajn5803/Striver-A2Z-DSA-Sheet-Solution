package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern4 problem1 = new Pattern4();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }



    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)System.out.print(i+1+" ");
            System.out.println();
        }
    }
}
