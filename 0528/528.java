
class Solution {
    int[] prefix;
    Random rand = new Random();
    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];
        for (int i = 1; i < w.length; i++) prefix[i] = prefix[i-1] + w[i];
    }
    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length-1]) + 1;
        int lo = 0, hi = prefix.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (prefix[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
