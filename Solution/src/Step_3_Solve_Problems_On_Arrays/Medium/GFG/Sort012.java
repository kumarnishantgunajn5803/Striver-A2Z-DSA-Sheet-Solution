package Step_3_Solve_Problems_On_Arrays.Medium.GFG;

public class Sort012 {

        public static void sort012(int a[], int n)
        {
            int low=0;
            int mid=0;
            int high=n-1;
            while(mid<=high){
                int curr = a[mid];
                if(curr==0){
                    swap(a,low,mid);
                    low++;
                    mid++;
                }else if(curr==2){
                    swap(a,mid,high);
                    high--;
                }else{
                    mid++;
                }
            }
        }
        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
