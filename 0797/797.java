
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(graph, 0, new ArrayList<>(Arrays.asList(0)), res);
        return res;
    }
    void dfs(int[][] g, int node, List<Integer> path, List<List<Integer>> res) {
        if (node == g.length - 1) { res.add(new ArrayList<>(path)); return; }
        for (int nb : g[node]) { path.add(nb); dfs(g, nb, path, res); path.remove(path.size() - 1); }
    }
}
