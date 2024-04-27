
class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int lo = 1, hi = k + 1, idx = 0;
        while (lo <= hi) { res[idx++] = lo++; res[idx++] = hi--; }
        if (idx < n) idx--;
        for (int i = k + 2; i <= n; i++) res[idx++] = i;
        return res;
    }
}
