
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] t : times) graph.computeIfAbsent(t[0], x -> new ArrayList<>()).add(new int[]{t[1], t[2]});
        int[] dist = new int[n + 1]; Arrays.fill(dist, Integer.MAX_VALUE); dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, k});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll(); int d = cur[0], u = cur[1];
            if (d > dist[u]) continue;
            for (int[] nb : graph.getOrDefault(u, new ArrayList<>())) {
                if (dist[u] + nb[1] < dist[nb[0]]) { dist[nb[0]] = dist[u] + nb[1]; pq.offer(new int[]{dist[nb[0]], nb[0]}); }
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) { if (dist[i] == Integer.MAX_VALUE) return -1; res = Math.max(res, dist[i]); }
        return res;
    }
}
