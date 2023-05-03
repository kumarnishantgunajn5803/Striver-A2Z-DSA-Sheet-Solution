package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;

public class Median_Of_Two_Sorted_Array {
    //Naive Approach

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int n=nums1.length;
//        int m = nums2.length;
//
//        int[] arr = new int[n+m];
//        int p1=0;
//        int p2=0;
//        int indx=0;
//        while(p1<n && p2<m){
//            if(nums1[p1]<nums2[p2]){
//                arr[indx++]=nums1[p1++];
//
//            }
//            else if(nums1[p1]>nums2[p2]){
//                arr[indx++]=nums2[p2++];
//
//            }
//            else{
//                arr[indx++]=nums2[p2++];
//                arr[indx++]=nums1[p1++];
//            }
//        }
//
//        if(p1<n){
//            while(p1<n){
//                arr[indx++]=nums1[p1++];
//            }
//        }else{
//            while(p2<m){
//                arr[indx++]=nums2[p2++];
//            }
//
//        }
//        if(arr.length%2==0){
//            int j= arr.length/2;
//            int sum = arr[j]+arr[j-1];
//            return (double)sum/2;
//        }else{
//            int j= arr.length/2;
//            int sum = arr[j] ;
//            return sum;
//        }
//
//    }
  //Optimized Approach
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length <nums1.length)return  findMedianSortedArrays(nums2,nums1);
        int n1=nums1.length;
        int n2=nums2.length;

        int l=0;
        int r=n1;

        while (l<=r){
            int cut1 = l+(r-l)/2;
            int cut2 = (n1+n2+1)/2-cut1;

            int l1=cut1==0 ? Integer.MIN_VALUE :nums1[cut1-1];
            int l2=cut2==0 ? Integer.MIN_VALUE :nums2[cut2-1];

            int r1 = cut1==n1 ? Integer.MAX_VALUE :nums1[cut1];
            int r2 = cut2==n2 ? Integer.MAX_VALUE :nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0)return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                else return Math.max(l1,l2);
            }

            if(l1>r2)r=cut1-1;
            else l=cut1+1;
        }

        return 0.0;
    }
}
