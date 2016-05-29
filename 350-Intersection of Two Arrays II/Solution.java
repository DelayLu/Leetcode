public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++){
            if(!map1.containsKey(nums1[i])){
                map1.put(nums1[i], 1);
            }else{
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(map1.containsKey(nums2[i])){
                if(!map2.containsKey(nums2[i])){
                    map2.put(nums2[i], 1);
                }else{
                    if(map2.get(nums2[i]) + 1 >= map1.get(nums2[i])){
                        map2.put(nums2[i], map1.get(nums2[i]));
                    }else{
                        map2.put(nums2[i], map2.get(nums2[i]) + 1);
                    }
                }
            }
        }
        
        int sum = 0;
        for(Integer value : map2.values()){
            sum += value;
        }
        int[] result = new int[sum];
        int a = 0;
        for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                result[a] = entry.getKey();
                a++;
            }
        }
        return result;
    }
}