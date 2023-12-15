class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while(r < s.length()){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            else{
                set.add(s.charAt(r++));
                res = Math.max(res,set.size());
            }
        }
        
        return res;
        
    }
}