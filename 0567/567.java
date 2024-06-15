
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] cnt = new int[26];
        for (char c : s1.toCharArray()) cnt[c-'a']++;
        int l = 0, match = 0;
        for (int r = 0; r < s2.length(); r++) {
            if (--cnt[s2.charAt(r)-'a'] >= 0) match++;
            if (r - l + 1 > s1.length()) {
                if (++cnt[s2.charAt(l)-'a'] > 0) match--;
                l++;
            }
            if (match == s1.length()) return true;
        }
        return false;
    }
}
