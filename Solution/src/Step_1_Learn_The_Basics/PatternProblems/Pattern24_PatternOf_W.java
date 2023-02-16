package Step_1_Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*


\        /\        /
 \      /  \      /
  \    /    \    /
   \  /      \  /
    \/        \/



 */
public class Pattern24_PatternOf_W {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern24_PatternOf_W problem1 = new Pattern24_PatternOf_W();
           System.out.println("Output :-");
          problem1.printPattern(n);
       }
    }




    public static void printPattern(int k){

        int a;
        int b;
        for (a = 1; a <= k; a++) {

            for (b = 1; b <= k*4; b++) {

                if (a == b || b == (a+(2*k)-1)){
                    System.out.print("\\");

                }

                if (b == (2*k-a) || b==k*4-a-1){
                    System.out.print("/");
                    if(b==k*4-a-1)break;
                }

                else System.out.print(" ");



            }


            System.out.println();
        }
    }

}
