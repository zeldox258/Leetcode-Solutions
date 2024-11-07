class Solution {
    public int largestCombination(int[] candidates) {
        int ans = 0;
        for (int i = 23; i >= 0; i--) {
            int cnt = 0;
            for (int x : candidates) {
                cnt += (x >> i) & 1;
            }
            ans = Math.max(ans, cnt);
        }

        return ans;
    }
}