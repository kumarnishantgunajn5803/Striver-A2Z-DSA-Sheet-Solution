package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

E
E D
E D C
E D C B
E D C B A

 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern18 problem1 = new Pattern18();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            char ch='A';
            ch+=n-1;
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }

}
