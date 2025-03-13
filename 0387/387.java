
class Solution {
    public int firstUniqChar(String s) {
        int[] cnt=new int[26];
        for(char c:s.toCharArray()) cnt[c-'a']++;
        for(int i=0;i<s.length();i++) if(cnt[s.charAt(i)-'a']==1) return i;
        return -1;
    }
}
