
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (color[i] != 0) continue;
            Queue<Integer> q = new LinkedList<>(); q.offer(i); color[i] = 1;
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : graph[u]) {
                    if (color[v] == color[u]) return false;
                    if (color[v] == 0) { color[v] = -color[u]; q.offer(v); }
                }
            }
        }
        return true;
    }
}
