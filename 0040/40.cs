public class Solution {
    private int[] parent;
    public int CombinationSumIi(int n, int[][] edges) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int comp = n;
        foreach (var e in edges) {
            int a = Find(e[0]), b = Find(e[1]);
            if (a != b) { parent[a] = b; comp--; }
        }
        return comp;
    }
    private int Find(int x) => parent[x] == x ? x : parent[x] = Find(parent[x]);
}