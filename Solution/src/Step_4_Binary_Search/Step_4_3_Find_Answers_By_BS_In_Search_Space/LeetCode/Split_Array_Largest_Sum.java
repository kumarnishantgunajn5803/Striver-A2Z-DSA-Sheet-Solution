package Step_4_Binary_Search.Step_4_3_Find_Answers_By_BS_In_Search_Space.LeetCode;

public class Split_Array_Largest_Sum {
    int[] arr;
    int k;
    public int splitArray(int[] nums, int k) {
        this.arr=nums;
        this.k=k;
        int low=0;
        long high=0;
        for(int i:nums){
            low=Math.max(i,low);
            high+=i;
        }
        int ans=0;

        while(low<=high){
            int mid = low +((int)high-low) /2;

            if(isPossible(mid)){

                ans=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return ans;
    }

    public boolean isPossible(int mid){
        int count=1;
        long sum=0;
        for(int i:arr){
            if(i>mid)return false;
            if(sum+i > mid){
                count++;
                sum=i;
            }else sum+=i;
        }
        if(count>k)return false;
        return true;
    }
}
