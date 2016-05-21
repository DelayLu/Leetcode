public class Solution {
    public void moveZeroes(int[] nums) {
        int m = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                m = i;
                while(m - 1 >= 0 && nums[m - 1] == 0){
                    int temp = nums[m];
                    nums[m] = nums[m-1];
                    nums[m-1] = temp;
                    m--;
                }
            }
        }
    }
}