
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt=new int[26];
        for(char c:magazine.toCharArray()) cnt[c-'a']++;
        for(char c:ransomNote.toCharArray()) if(--cnt[c-'a']<0) return false;
        return true;
    }
}
