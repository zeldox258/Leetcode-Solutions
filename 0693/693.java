
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n & 1; n >>= 1;
        while (n > 0) { if ((n & 1) == prev) return false; prev = n & 1; n >>= 1; }
        return true;
    }
}
