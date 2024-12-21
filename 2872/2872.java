class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Array of ArrayList for adjacency list
        List<Integer>[] adjList = new ArrayList[n];
        // Initialize each list
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            // u -> v
            adjList[u].add(v);
            // v-> u
            adjList[v].add(u);
        }
        int[] components = new int[1];
        dfs(0, -1, components, values, k, adjList);
        return components[0];
    }
    long dfs(int currentNode, int parentNode, int[] components,
        int[] values, int k, List<Integer>[] adjList){

        long sum = values[currentNode];
        for(int neighbor : adjList[currentNode]){
            if(neighbor != parentNode){
                sum += dfs(neighbor, currentNode, components, values, k, adjList);
            }
        }
        if(sum % k == 0){
            sum = 0;
            components[0]++;
        }
        return sum;
    }
}