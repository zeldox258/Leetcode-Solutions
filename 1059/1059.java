
class Solution {
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        java.util.Map<Integer,java.util.List<Integer>> graph=new java.util.HashMap<>();
        for(int[]e:edges) graph.computeIfAbsent(e[0],k->new java.util.ArrayList<>()).add(e[1]);
        int[]state=new int[n]; return dfs(graph,source,destination,state);
    }
    boolean dfs(java.util.Map<Integer,java.util.List<Integer>>g,int node,int dest,int[]state){
        if(!g.containsKey(node)||g.get(node).isEmpty()) return node==dest;
        if(state[node]==1) return false; if(state[node]==2) return true;
        state[node]=1; for(int next:g.get(node)) if(!dfs(g,next,dest,state)) return false;
        state[node]=2; return true;
    }
}
