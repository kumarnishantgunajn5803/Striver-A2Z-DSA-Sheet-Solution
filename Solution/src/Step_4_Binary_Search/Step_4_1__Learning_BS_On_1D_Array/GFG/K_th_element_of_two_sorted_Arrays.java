package Step_4_Binary_Search.Step_4_1__Learning_BS_On_1D_Array.GFG;
/*
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K.
 The task is to find the element that would be at the k’th position of the final sorted array.
 */
public class K_th_element_of_two_sorted_Arrays {

    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        if(n>m)return kthElement(arr2,arr1,m,n,k);
        int low = Math.max(0,k-m);
        int high=Math.min(k,n);

        while(low<=high){
            int part1 = low+(high-low)/2;
            int part2 = k-part1;
            int l1= part1==0 ? Integer.MIN_VALUE :arr1[part1-1];
            int l2= part2==0 ? Integer.MIN_VALUE :arr2[part2-1];

            int r1=part1==n?Integer.MAX_VALUE :arr1[part1];
            int r2=part2==m?Integer.MAX_VALUE :arr2[part2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }else if(l1>r2){
                high=part1-1;
            }else{
                low=part1+1;
            }
        }

        return -1;
    }
}
