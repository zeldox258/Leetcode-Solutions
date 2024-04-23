
class Solution {
    public int flipLightsBulb(int n, int presses) {
        n = Math.min(n, 3);
        Set<Integer> seen = new HashSet<>();
        for (int p = 0; p < (1 << 4); p++) {
            int[] bulbs = new int[n];
            Arrays.fill(bulbs, 1);
            int cnt = Integer.bitCount(p);
            if (cnt % 2 != presses % 2 || cnt > presses) continue;
            if ((p >> 0 & 1) == 1) for (int i = 0; i < n; i++) bulbs[i] ^= 1;
            if ((p >> 1 & 1) == 1) for (int i = 0; i < n; i += 2) bulbs[i] ^= 1;
            if ((p >> 2 & 1) == 1) for (int i = 1; i < n; i += 2) bulbs[i] ^= 1;
            if ((p >> 3 & 1) == 1) for (int i = 0; i + 2 < n; i += 3) bulbs[i] ^= 1;
            int state = 0;
            for (int i = 0; i < n; i++) state |= bulbs[i] << i;
            seen.add(state);
        }
        return seen.size();
    }
}
