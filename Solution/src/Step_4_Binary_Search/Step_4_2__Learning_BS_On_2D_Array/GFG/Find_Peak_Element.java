package Step_4_Binary_Search.Step_4_2__Learning_BS_On_2D_Array.GFG;
/*
An element is called a peak element if its value is not smaller than the value of its adjacent
elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct.
Otherwise output will be 0.


 */
public class Find_Peak_Element {

    public int peakElement(int[] arr,int n)
    {
        int l =0;
        int h = n-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else h=mid;
        }

        return l;
    }
}
