package Step_3_Solve_Problems_On_Arrays.Easy;

public class SearchingAnElementInAnSortedArray {

    static int searchInSorted(int arr[], int N, int K){

        int l=0;
        int h =N-1;
        while(l<=h){
            int mid =l+(h-l)/2;
            if(arr[mid]==K)return 1;
            if(arr[mid]<K){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return -1;
    }
}
