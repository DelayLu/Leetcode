public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = true;
        
        if(s.length() != t.length()){
            result = false;
        }else{
            char[] sc = s.toCharArray();
            char[] tc = t.toCharArray();
            Arrays.sort(sc);
            Arrays.sort(tc);
            String S = new String(sc);
            String T = new String(tc);
            if(!S.equals(T)){
                result = false;
            }
        }
        return result;
    }
}