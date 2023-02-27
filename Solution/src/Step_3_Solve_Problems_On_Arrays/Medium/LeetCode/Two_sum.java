package Step_3_Solve_Problems_On_Arrays.Medium.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] in = new int[2];
//         int n=nums.length;

//         int[] arr1 = new int[n];
//         for(int i=0;i<n;i++){

//             arr1[i]=i;
//         }

//         mergeSort(nums,arr1,0,n-1,n);

//       int l=0;

//       int r=n-1;
//       while(l<r){
//           if(nums[l]+nums[r]== target){
//               in[0]=arr1[l];
//               in[1]=arr1[r];
//               break;
//           }
//           if(nums[l]+nums[r]<target){
//               l++;
//           }
//           if(nums[l]+nums[r]>target){
//              r--;
//           }

//       }
//       return in;
//     }
//    public static void mergeSort(int[] arr ,int[] arr1, int low , int high,int n){
//         if(low >= high) return;
//         int mid = low +((high-low)/2);

//         mergeSort(arr,arr1,low,mid,n);
//         mergeSort(arr,arr1, mid+1,high,n);
//         merge(arr,arr1, low,mid,high,n);

//     }
//     public static void merge(int[] arr ,int[] arr1, int low , int mid ,int high,int n){
//         int[] ans=  new int[high-low +1];
//          int[] ans1=  new int[high-low +1];
//         int i = low;
//         int j = mid+1;
//          int k=0;
//         while(i<=mid && j<=high){
//             if(arr[i]<=arr[j]){
//                  ans[k]=arr[i];
//                   ans1[k++]=arr1[i];
//                 i++;
//             }else{
//                  ans[k]=arr[j];
//                   ans1[k++]=arr1[j];
//                 j++;
//             }
//         }
//         while(i<=mid){
//              ans[k]=arr[i];
//               ans1[k++]=arr1[i++];

//         }
//         while(j<=high){
//             ans[k]=arr[j];
//              ans1[k++]=arr1[j++];

        //         }
//         // System.out.println(Arrays.toString(ans));
//         for( int l=0,t=low; l<ans.length; l++,t++){
//             arr[t]=ans[l];
//              arr1[t]=ans1[l];
//         }
//     }
        public int[] twoSum(int[] nums, int target) {
            int[] in = new int[2];
            int n=nums.length;

            Map<Integer, Integer > map = new HashMap<>();
            for(int i=0;i<n;i++){
                int required = target-nums[i];
                if(map.containsKey(required)){
                    in[0]=map.get(required);
                    in[1]=i;
                    break;
                }else{
                    map.put(nums[i],i);
                }
            }

            return in;
        }
    }
}
