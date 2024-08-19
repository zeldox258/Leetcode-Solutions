
class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] cnt = new int[26];
        int maxLen = 0;
        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i-1) + 26) % 26 == 1) maxLen++;
            else maxLen = 1;
            int idx = p.charAt(i) - 'a';
            cnt[idx] = Math.max(cnt[idx], maxLen);
        }
        int sum = 0;
        for (int c : cnt) sum += c;
        return sum;
    }
}
