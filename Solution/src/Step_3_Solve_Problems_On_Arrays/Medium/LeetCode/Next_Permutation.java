package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;
/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3],
[2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
 More formally, if all the permutations of the array are sorted in one container according to their lexicographical
  order, then the next permutation of that array is the permutation that follows it in the sorted container.
   If such arrangement is not possible, the array must be rearranged as the lowest possible order
   (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical
larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.
 */
public class Next_Permutation {

    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int i=n-2;
        int indx=-1;
        while(i>=0){
            if(arr[i]<arr[i+1]){
                indx=i;
                break;
            }
            i--;
        }
        int j=n-1;
        if(indx!=-1)
            while(j>=0){
                if( arr[j]>arr[indx]){
                    swap(arr,j,indx);
                    break;
                }
                j--;
            }

        rev(arr,indx+1,n-1);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void rev(int[] arr , int i, int j){
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
