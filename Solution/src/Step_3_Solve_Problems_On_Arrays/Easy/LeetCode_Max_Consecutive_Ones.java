package Step_3_Solve_Problems_On_Arrays.Easy;

public class LeetCode_Max_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int  max =0;
        int count=0;
        for(Integer i:nums){
            if(i==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }

        return max;
    }
}
