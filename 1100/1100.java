
class Solution {
    public int longestSubstring(String s, int k) {
        if(k==1)return s.length();
        int[]cnt=new int[26];for(char c:s.toCharArray())cnt[c-'a']++;
        for(int i=0;i<s.length();i++){if(cnt[s.charAt(i)-'a']<k){int res=0;for(String sub:s.split(String.valueOf(s.charAt(i))))res=Math.max(res,longestSubstring(sub,k));return res;}}
        return s.length();
    }
}
