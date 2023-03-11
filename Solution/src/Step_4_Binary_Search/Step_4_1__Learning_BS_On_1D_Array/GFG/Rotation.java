package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given an ascending sorted rotated array Arr of distinct integers of size N.
The array is right rotated K times. Find the value of K.
 */
public class Rotation {

    int findKRotation(int arr[], int n) {
        int mid;

        int low=0,high=n-1;

        if(arr[low]<=arr[high])

            return 0;

        while(low<high)

        {

            mid=(low+high)/2;

            if(arr[mid]>=arr[0])

                low=mid+1;

            else

                high=mid;

        }

        return low;
    }
}
