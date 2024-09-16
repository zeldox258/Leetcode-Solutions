
import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>(); int[] pCnt=new int[26],sCnt=new int[26];
        for(char c:p.toCharArray()) pCnt[c-'a']++;
        for(int i=0;i<s.length();i++){sCnt[s.charAt(i)-'a']++;if(i>=p.length())sCnt[s.charAt(i-p.length())-'a']--;if(Arrays.equals(sCnt,pCnt))res.add(i-p.length()+1);}
        return res;
    }
}
