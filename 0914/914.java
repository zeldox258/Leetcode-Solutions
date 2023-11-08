
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        for (int c : deck) cnt.merge(c, 1, Integer::sum);
        int g = 0; for (int v : cnt.values()) g = gcd(g, v); return g >= 2;
    }
    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
