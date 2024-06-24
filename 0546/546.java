
class Solution {
    int[][] memo;
    public int removeBoxes(int[] boxes) {
        int n = boxes.length;
        memo = new int[n][n][n];
        return dfs(boxes, 0, n-1, 0);
    }
    int dfs(int[] boxes, int l, int r, int k) {
        if (l > r) return 0;
        if (memo[l][r][k] != 0) return memo[l][r][k];
        int ll = l, kk = k;
        while (ll < r && boxes[ll+1] == boxes[l]) { ll++; kk++; }
        int res = (kk+1)*(kk+1) + dfs(boxes, ll+1, r, 0);
        for (int m = ll+1; m <= r; m++)
            if (boxes[m] == boxes[l])
                res = Math.max(res, dfs(boxes,m,r,kk+1) + dfs(boxes,ll+1,m-1,0));
        return memo[l][r][k] = res;
    }
}
