package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */
public class Pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern22 problem1 = new Pattern22();
           System.out.println("Output :-");
          problem1.printSquare(n);
       }
    }




    void printSquare(int n) {
        if(n==0)return;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){

                int t=i;
                int l=j;
                int r= 2*n-2-j;
                int b = 2*n-2-i;

                System.out.print(n-Math.min(Math.min(t,b),Math.min(l,r)) +" ");

            }

            System.out.println();
        }
    }

}
