class Solution {
    int dia;
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int n1 = edges1.length + 1;
        int n2 = edges2.length + 1;
        ArrayList<Integer>[] graph1 = new ArrayList[n1];
        ArrayList<Integer>[] graph2 = new ArrayList[n2];

        for (int i = 0; i < n1; i++) graph1[i] = new ArrayList<>();
        for (int i = 0; i < n2; i++) graph2[i] = new ArrayList<>();
        for (int[] edge : edges1) {
            graph1[edge[0]].add(edge[1]);
            graph1[edge[1]].add(edge[0]);
        }
        for (int[] edge : edges2) {
            graph2[edge[0]].add(edge[1]);
            graph2[edge[1]].add(edge[0]);
        }
        dia = -1;
        boolean[] visited1 = new boolean[n1];
        getDia(0, graph1, visited1);
        int d1 = dia;

        dia = -1;
        boolean[] visited2 = new boolean[n2];
        getDia(0, graph2, visited2);
        int d2 = dia;

        int cand = (d1 + 1) / 2 + (d2 + 1) / 2 + 1;
        return Math.max(cand, Math.max(d1, d2));
    }
    private int getDia(int src, ArrayList<Integer>[] graph, boolean[] visited) {
        visited[src] = true;
        int dch = -1, sdch = -1;

        for (int child : graph[src]) {
            if (!visited[child]) {
                int ch = getDia(child, graph, visited);
                if (ch > dch) {
                    sdch = dch;
                    dch = ch;
                } else if (ch > sdch) {
                    sdch = ch;
                }
            }
        }
        if (dch + sdch + 2 > dia) dia = dch + sdch + 2;
        return dch + 1;
    }
}