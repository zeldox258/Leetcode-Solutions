
class Solution {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        Map<Character, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < n; i++) pos.computeIfAbsent(ring.charAt(i), k->new ArrayList<>()).add(i);
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);
        for (int idx : pos.get(key.charAt(0))) dp[0][idx] = Math.min(idx, n-idx) + 1;
        for (int i = 1; i < m; i++) {
            for (int j : pos.get(key.charAt(i))) {
                for (int k : pos.get(key.charAt(i-1))) {
                    if (dp[i-1][k] == Integer.MAX_VALUE) continue;
                    int diff = Math.abs(j-k);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][k] + Math.min(diff, n-diff) + 1);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int idx : pos.get(key.charAt(m-1))) res = Math.min(res, dp[m-1][idx]);
        return res;
    }
}
