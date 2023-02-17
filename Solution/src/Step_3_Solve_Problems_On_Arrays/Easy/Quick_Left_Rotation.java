package Step_3_Solve_Problems_On_Arrays.Easy;

public class Quick_Left_Rotation {
    void leftRotate(long arr[], int k,int n) {
        k =k%n;
        reverse(arr,0,n-1);

        reverse(arr,0,n-k-1);

        reverse(arr,n-k,n-1);


    }
    public static void reverse(long[] arr , int start , int end){
        while(start<=end){
            long temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
