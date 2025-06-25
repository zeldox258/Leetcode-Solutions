
import java.util.*;
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0, res=0;
        for (int r=0;r<s.length();r++) {
            char c=s.charAt(r); map.merge(c,1,Integer::sum);
            while (map.size()>k) { char lc=s.charAt(l++); map.merge(lc,-1,Integer::sum); if(map.get(lc)==0) map.remove(lc); }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
