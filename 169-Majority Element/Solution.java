public class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], 1);
            }else{
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(hashMap.get(nums[i]) > nums.length / 2){
                result = nums[i];
            }
        }
        return result;
    }
}