class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == s.charAt(i)) continue;
            if (j - i == k) return true;
            i = j;
        }

        return (n - i) == k;
    }
}