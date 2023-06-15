
class Solution {
    public int digitsCount(int d, int low, int high) {
        return count(high, d) - count(low - 1, d);
    }
    int count(int n, int d) {
        if (n < 0) return 0;
        String s = String.valueOf(n); int len = s.length(), res = 0;
        for (int i = 0; i < len; i++) {
            int cur = s.charAt(i) - '0', high = (int)Math.pow(10, len-i-1);
            int low2 = (int)Math.pow(10, len-i-1);
            if (d == 0) { if (i > 0) { res += (cur - 1) * high; int suffix = n % high; res += Math.min(suffix + 1, high); } }
            else { res += cur * high; if (cur > d) res += high; else if (cur == d) res += n % high + 1; }
        }
        if (d == 0) { for (int i = 1; i < len; i++) res += (int)Math.pow(10, i-1) * 9 * i; }
        else { for (int i = 1; i < len; i++) res += (int)Math.pow(10, i-1) * i; }
        return res;
    }
}
