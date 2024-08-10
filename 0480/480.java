
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] res = new double[n - k + 1];
        TreeMap<Integer, Integer> lo = new TreeMap<>(), hi = new TreeMap<>();
        int loSz = 0, hiSz = 0;
        for (int i = 0; i < n; i++) {
            // add nums[i]
            if (lo.isEmpty() || nums[i] <= lo.lastKey()) { lo.merge(nums[i],1,Integer::sum); loSz++; }
            else { hi.merge(nums[i],1,Integer::sum); hiSz++; }
            // balance
            while (loSz > hiSz + 1) { int v=lo.lastKey(); removeFrom(lo,v); loSz--; hi.merge(v,1,Integer::sum); hiSz++; }
            while (hiSz > loSz) { int v=hi.firstKey(); removeFrom(hi,v); hiSz--; lo.merge(v,1,Integer::sum); loSz++; }
            if (i >= k) {
                int rem = nums[i - k];
                if (!lo.isEmpty() && rem <= lo.lastKey()) { removeFrom(lo,rem); loSz--; }
                else { removeFrom(hi,rem); hiSz--; }
                // rebalance after removal
                while (loSz > hiSz + 1) { int v=lo.lastKey(); removeFrom(lo,v); loSz--; hi.merge(v,1,Integer::sum); hiSz++; }
                while (hiSz > loSz) { int v=hi.firstKey(); removeFrom(hi,v); hiSz--; lo.merge(v,1,Integer::sum); loSz++; }
            }
            if (i >= k - 1) {
                if (k % 2 == 1) res[i-k+1] = lo.lastKey();
                else res[i-k+1] = ((double)lo.lastKey() + hi.firstKey()) / 2.0;
            }
        }
        return res;
    }
    void removeFrom(TreeMap<Integer,Integer> map, int val) {
        map.merge(val, -1, Integer::sum);
        if (map.get(val) == 0) map.remove(val);
    }
}
