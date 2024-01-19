
class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] r : richer) adj.get(r[1]).add(r[0]);
        int[] res = new int[n]; for (int i = 0; i < n; i++) res[i] = -1;
        for (int i = 0; i < n; i++) dfs(i, quiet, adj, res);
        return res;
    }
    int dfs(int node, int[] quiet, List<List<Integer>> adj, int[] res) {
        if (res[node] >= 0) return res[node];
        res[node] = node;
        for (int nb : adj.get(node)) { int cand = dfs(nb, quiet, adj, res); if (quiet[cand] < quiet[res[node]]) res[node] = cand; }
        return res[node];
    }
}
