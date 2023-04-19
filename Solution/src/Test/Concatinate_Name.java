package Test;

import java.util.Scanner;

public class Concatinate_Name {
    public static void main(String[] args) {
        System.out.println("Please Enter The name of the question");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        String ans="";
        for(int i=0;i<arr.length-1;i++){
            ans+=arr[i]+"_";
        }
        ans+=arr[arr.length-1];
        System.out.println(ans);
    }
}
/*
My patience is waning, is this entertaining
our patience is waning , is this entertaining
I-I-I got this feeling ,yeah , you know
where  I am losing all control
cause there's magic in my bones
I-I-I got this feeling in my soul
go ahead and throw your stones
cause there's magic in my bones
 */