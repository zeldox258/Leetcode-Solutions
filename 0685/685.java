
class Solution {
    int[] parent, rank;
    int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
    boolean union(int x, int y) { int px = find(x), py = find(y); if (px == py) return false; if (rank[px] < rank[py]) { int t = px; px = py; py = t; } parent[py] = px; if (rank[px] == rank[py]) rank[px]++; return true; }
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1]; rank = new int[n + 1];
        for (int i = 0; i <= n; i++) parent[i] = i;
        int[] inDeg = new int[n + 1];
        for (int[] e : edges) inDeg[e[1]]++;
        int cand1 = -1, cand2 = -1;
        for (int i = edges.length - 1; i >= 0; i--) { if (inDeg[edges[i][1]] == 2) { if (cand1 == -1) cand1 = i; else cand2 = i; } }
        for (int i = 0; i < edges.length; i++) {
            if (i == cand1) continue;
            if (!union(edges[i][0], edges[i][1])) return cand2 == -1 ? edges[i] : edges[cand2];
        }
        return edges[cand1];
    }
}
