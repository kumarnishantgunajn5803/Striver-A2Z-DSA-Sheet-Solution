package Learn_The_Basics.LearnBasicRecursion;

import java.util.Scanner;

public class PrintNTo1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();

        printNos(n);
    }

   static void printNos(int N) {
        if(N<1)return;
        System.out.print(N+" ");
        printNos(N-1);
    }
}
