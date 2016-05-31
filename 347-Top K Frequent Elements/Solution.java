public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> resultList = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        while(k != 0){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            resultList.add(maxKey);
            map.remove(maxKey);
            k--;
            max = Integer.MIN_VALUE;
            maxKey = 0;
        }
        return resultList;
    }
}