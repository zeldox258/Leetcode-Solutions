import java.util.*;
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>2){char c=s.charAt(l);map.put(c,map.get(c)-1);if(map.get(c)==0)map.remove(c);l++;}
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}