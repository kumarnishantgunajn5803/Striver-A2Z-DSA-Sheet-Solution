package Step_3_Solve_Problems_On_Arrays.Easy;

public class MoveAllZeroesToTheEndOfTheArray {

    public void moveZeroes(int[] nums) {
        int z=0;
        int nz=1;
        while(z<nums.length && nz<nums.length){
            if(nums[z]!=0){
                z++;
            }else{
                if(nums[nz]==0 || nz<z){
                    nz++;
                }else{
                    int temp=nums[nz];
                    nums[nz]=0;
                    nums[z]=temp;
                    z++;
                    nz++;
                }
            }
        }
    }
}
