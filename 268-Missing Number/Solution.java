public class Solution {
    public int missingNumber(int[] nums) {
        int result = 1;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum1 += nums[i];
        }
        for(int i = 0; i < nums.length + 1; i++){
            sum2 += i;
        }
        result = sum2 - sum1;
        
        return result;
    }
}