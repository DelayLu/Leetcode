public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() != 0){
            if(set.size() == nums.length){
                result = false;
            }else {
                result = true;
            }
        }
        return result;
    }
}