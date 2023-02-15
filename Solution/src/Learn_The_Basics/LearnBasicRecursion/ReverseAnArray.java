package Learn_The_Basics.LearnBasicRecursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr){
//        return  revreseArray(arr,0,arr.length-1);
        revreseArray(arr,0);
        return  arr;
    }

    //using one variable
    public  static  void revreseArray(int[] arr , int i){
        if(i>=arr.length/2)return;
        swap(arr,i,arr.length-i-1);
        revreseArray(arr,i+1);
    }

    //using two variable
//    public static int[] revreseArray(int[] arr, int start , int end){
//        if(start>=end)return arr;
//        swap(arr,start,end);
//      return   revreseArray(arr,start+1,end-1);
//    }
    public static  void swap( int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
