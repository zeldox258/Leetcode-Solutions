
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] d : dislikes) { adj.get(d[0]).add(d[1]); adj.get(d[1]).add(d[0]); }
        int[] color = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (color[i] != 0) continue;
            Queue<Integer> q = new LinkedList<>(); q.offer(i); color[i] = 1;
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : adj.get(u)) {
                    if (color[v] == color[u]) return false;
                    if (color[v] == 0) { color[v] = -color[u]; q.offer(v); }
                }
            }
        }
        return true;
    }
}
