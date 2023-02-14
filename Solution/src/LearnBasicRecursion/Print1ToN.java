package LearnBasicRecursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();

         printNos(n);
    }

 //GFG solution
    public static void printNos(int N)
    {
        if(N<1)return;
        printNos(N-1);
        System.out.print(N+" ");
    }
}
