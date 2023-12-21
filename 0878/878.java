
class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = (long)a / gcd(a, b) * b;
        long lo = 0, hi = (long)n * Math.min(a, b), mod = 1_000_000_007;
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            if (mid / a + mid / b - mid / lcm >= n) hi = mid; else lo = mid + 1;
        }
        return (int)(lo % mod);
    }
    long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
}
