package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

   A
  ABA
 ABCBA
ABCDCBA
 */
public class Pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern17 problem1 = new Pattern17();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';


            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<i){
                    ch++;
                }else{
                    ch--;
                }

            }

            System.out.println();
        }
    }

}
