package Learn_The_Basics.LearnBasicRecursion;

import java.util.Scanner;

public class PrintGFGNTimes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();

        printGfg(n);
    }
   static void printGfg(int N) {
        if(N<1)return;
        System.out.print("GFG"+" ");
        printGfg(N-1);
    }
}
