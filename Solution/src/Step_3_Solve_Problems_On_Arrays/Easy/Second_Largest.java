package Step_3_Solve_Problems_On_Arrays.Easy;

import java.util.Scanner;

// Quesiton :- Given an array Arr of size N, print second largest distinct element from an array.
public class Second_Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Second_Largest  second_largest = new Second_Largest();
       int ans = second_largest.print2largest(arr,n);
        System.out.println(ans);

    }


    int print2largest(int arr[], int n) {
        int max=-1;
        int smax=-1;
        for(Integer i:arr){
            if(max<i){
                smax=max;
                max=i;
            }

            if(smax<i && max>i){

                smax=i;
            }
        }
        return smax;
    }
}
