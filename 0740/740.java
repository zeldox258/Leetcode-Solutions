
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for (int n : nums) sum[n] += n;
        int prev = 0, cur = 0;
        for (int i = 1; i < sum.length; i++) { int tmp = cur; cur = Math.max(cur, prev + sum[i]); prev = tmp; }
        return cur;
    }
}
