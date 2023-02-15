package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

 * * * * * * * *
 * *         * *
 *   *     *   *
 *     * *     *
 *     * *     *
 *   *     *   *
 * *         * *
 * * * * * * * *


 */
public class Pattern23_X_square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern23_X_square problem1 = new Pattern23_X_square();
           System.out.println("Output :-");
          problem1.printPattern(n);
       }
    }




    public   void printPattern(int k){

        int a;
        int b;




        for (a = 1; a <= k; a++) {

            for (b = 1; b <= k; b++) {

                if (a == 1 || a == k || b == 1 || b == k
                        || a == b || b == (k - a + 1))


                    System.out.print("* ");
                else


                    System.out.print("  ");
            }


            System.out.println();
        }
    }

}
