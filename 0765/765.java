
class Solution {
    int[] parent;
    int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
    void union(int x, int y) { parent[find(x)] = find(y); }
    public int minSwapsCouples(int[] row) {
        int n = row.length; parent = new int[n / 2];
        for (int i = 0; i < n / 2; i++) parent[i] = i;
        for (int i = 0; i < n; i += 2) union(row[i] / 2, row[i+1] / 2);
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n / 2; i++) cnt.merge(find(i), 1, Integer::sum);
        int res = 0; for (int v : cnt.values()) res += v - 1;
        return res;
    }
}
