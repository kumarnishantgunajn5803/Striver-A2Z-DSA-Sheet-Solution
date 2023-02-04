package PatternProblems;

import java.util.Scanner;

//print the pattern like  :-
/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */
public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Please Enter the Integer n ");
       int n= s.nextInt();
       if(n<=0)System.out.println("Plase Enter valid number");
       else{
          Pattern11 problem1 = new Pattern11();
           System.out.println("Output :-");
          problem1.printTriangle(n);
       }
    }




    void printTriangle(int n) {
        int start =1;
        for(int i=0;i<n;i++){
            if(i%2==0)start=1;
            else start=0;

            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();

        }
    }
}
