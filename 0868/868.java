
class Solution {
    public int binaryGap(int n) {
        int res = 0, prev = -1, pos = 0;
        while (n > 0) { if ((n & 1) == 1) { if (prev >= 0) res = Math.max(res, pos - prev); prev = pos; } n >>= 1; pos++; }
        return res;
    }
}
