package LearnBasicRecursion;

import java.util.Scanner;
// this code will check after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
public class LeetCodeValidPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a String");
        String str = scanner.next();
        PalindromeString palindromeString = new PalindromeString();

        System.out.println(palindromeString.isPalindrome(str));
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(char c:ch){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String str =sb.toString();
        //   System.out.println(str);
        return checkPalindrome(str,0);
    }

    boolean checkPalindrome(String s, int i){
        if(i>=s.length()/2)return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return checkPalindrome(s,i+1);
    }
}
