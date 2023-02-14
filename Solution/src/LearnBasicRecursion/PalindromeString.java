package LearnBasicRecursion;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a String");
        String str = scanner.next();
        PalindromeString palindromeString = new PalindromeString();

        System.out.println(palindromeString.isPalindrome(str));
    }

    //GFG Solution

    int isPalindrome(String S) {
        return checkPalindrome(S,0);
    }
    int checkPalindrome(String s, int i){
        if(i>=s.length()/2)return 1;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))return 0;
        return checkPalindrome(s, i+1);
    }
}
