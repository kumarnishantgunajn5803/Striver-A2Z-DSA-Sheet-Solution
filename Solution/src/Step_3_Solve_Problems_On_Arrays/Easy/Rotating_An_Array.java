package Step_3_Solve_Problems_On_Arrays.Easy;

public class Rotating_An_Array {
//GFG Solution
    void leftRotate(int[] arr, int n, int d) {

        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
    }
    public static void reverse(int[] arr , int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
