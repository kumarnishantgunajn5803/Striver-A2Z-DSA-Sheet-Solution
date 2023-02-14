package LearnBasicRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllFactorialOfNumberLessThanEqualToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        long n = scanner.nextLong();

        System.out.println(factorialNumbers( n));
    }

    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> list = new ArrayList<>();
        return fact(list,1,1,N);
    }
    static ArrayList<Long> fact(ArrayList<Long> list, long i , long f, long N){
        if(f*i>N){
            return list;
        }

        list.add(f*i);
        return  fact(list, (i+1) ,f*i, N);
    }
}
