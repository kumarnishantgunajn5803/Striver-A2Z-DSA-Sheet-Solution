package Learn_The_Basics.PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern12 problem1 = new Pattern12();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                System.out.print(j+1+" ");

            }
            for(int j=i+1;j<n;j++){
                System.out.print("  ");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("  ");
            }

            for(int j=i;j>=0;j--){

                System.out.print(j+1+" ");

            }
            System.out.println();
        }
    }
}
