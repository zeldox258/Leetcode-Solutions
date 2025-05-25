class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;

        List<List<Integer>> tree1 = buildGraph(edges1, n);
        List<List<Integer>> tree2 = buildGraph(edges2, m);

        int[] color1 = new int[2];
        int[] nodeColor1 = new int[n];
        bfs(tree1, color1, nodeColor1);

        int[] color2 = new int[2];
        int[] nodeColor2 = new int[m];
        bfs(tree2, color2, nodeColor2);

        int maxColor2 = Math.max(color2[0], color2[1]);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = color1[nodeColor1[i]] + maxColor2;
        }

        return result;
    }

    private List<List<Integer>> buildGraph(int[][] edges, int size) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < size; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }

    private void bfs(List<List<Integer>> graph, int[] colorCount, int[] nodeColor) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0], color = curr[1];
            nodeColor[node] = color;
            colorCount[color]++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, 1 - color});
                }
            }
        }
    }
}