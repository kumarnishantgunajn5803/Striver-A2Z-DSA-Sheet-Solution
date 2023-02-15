package Learn_The_Basics.LearnBasicRecursion;


import java.util.Arrays;
import java.util.Scanner;

//GFG Question
public class PrintNFibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = scanner.nextInt();
        System.out.println("Iterative:-");
        System.out.println(Arrays.toString(printFibb(n)));
        System.out.println("Recursive:-");
        System.out.println(Arrays.toString(printFibbRecusive(n)));
    }

    //iterative approach
    public static long[] printFibb(int n)
    {
        long[] ans = new long[n];
        ans[0]=1;
        if(n==1)return ans;
        ans[1]=1;
        for(int i=2;i<n;i++){
            ans[i] =ans[i-1]+ans[i-2];
        }
        return ans;
    }


    //Recursive Approach


    static  long[] ans;
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibbRecusive(int n)
    {
        ans = new long[n];
        fib(n);
        return ans;

    }
    public static long fib(int n ) {
        if(n<=1){
            if(n==1){
                ans[0]=1;
            }
            return n;
        }

        long l = fib(n-1);
        long sl = fib(n-2);
        ans[n-1]=l+sl;
        return  l+sl;

    }
}
