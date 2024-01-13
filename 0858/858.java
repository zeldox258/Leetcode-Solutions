
class Solution {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p, q), m = p/g, n = q/g;
        if (n % 2 == 0) return 0;
        if (m % 2 == 0) return 2;
        return 1;
    }
    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
