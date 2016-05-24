public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mult = 1;
        int[] output = new int[nums.length];
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
        }
        
        if(zeroCount >= 2){
            for(int i = 0; i < nums.length; i++){
                output[i] = 0;
            }
        }else if(zeroCount == 0){
            for(int i = 0; i < nums.length; i++){
                mult *= nums[i];
            }
            for(int i = 0; i < nums.length; i++){
                output[i] = mult / nums[i];
            }
        }else if(zeroCount == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    mult *= nums[i];
                }
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    output[i] = 0;
                }else{
                    output[i] = mult;
                }
            }
        }

        return output;
    }
}