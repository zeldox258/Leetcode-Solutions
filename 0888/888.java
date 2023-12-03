
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0; for (int a : aliceSizes) sa += a; for (int b : bobSizes) sb += b;
        Set<Integer> setA = new HashSet<>(); for (int a : aliceSizes) setA.add(a);
        for (int b : bobSizes) { int a = b + (sa - sb) / 2; if (setA.contains(a)) return new int[]{a, b}; }
        return new int[0];
    }
}
