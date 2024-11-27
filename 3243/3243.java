class Solution {
    public int dfs(ArrayList<Integer>[] graph, int idx, int n, int[] dp) {
        if(idx==n) return 0;
        if(dp[idx] != Integer.MAX_VALUE) return dp[idx];
        int min = (int)1e9;
        for(int ele: graph[idx]) {
            min = Math.min(min, 1+dfs(graph, ele, n, dp));
            dp[idx] = Math.min(dp[idx], min);
        }

        return min;
    }
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        int[] dp = new int[n];
        int[] arr = new int[queries.length];



        for(int i = 0; i<n; i++) {
            graph[i] = new ArrayList<>();
            graph[i].add(i+1);
        }
        int idx = 0;
        for(int[] q: queries) {
            int x = q[0];
            int y = q[1];

            graph[x].add(y);
            Arrays.fill(dp, Integer.MAX_VALUE);
            int val = dfs(graph, 0, n-1, dp);
            arr[idx++] = val;
        }

        return arr;
    }
}