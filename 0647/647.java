
class Solution {
    public int countSubstrings(String s) {
        int count = 0, n = s.length();
        for (int center = 0; center < 2*n-1; center++) {
            int l = center/2, r = l + center%2;
            while (l >= 0 && r < n && s.charAt(l)==s.charAt(r)) { count++; l--; r++; }
        }
        return count;
    }
}
