
class Solution {
    int timer=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] graph=new List[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList<>();
        for(List<Integer> c:connections){graph[c.get(0)].add(c.get(1));graph[c.get(1)].add(c.get(0));}
        int[] disc=new int[n],low=new int[n];
        Arrays.fill(disc,-1);
        List<List<Integer>> res=new ArrayList<>();
        dfs(0,-1,graph,disc,low,res);
        return res;
    }
    void dfs(int u,int parent,List<Integer>[] g,int[] disc,int[] low,List<List<Integer>> res){
        disc[u]=low[u]=timer++;
        for(int v:g[u]){
            if(disc[v]==-1){dfs(v,u,g,disc,low,res);low[u]=Math.min(low[u],low[v]);if(low[v]>disc[u])res.add(Arrays.asList(u,v));}
            else if(v!=parent) low[u]=Math.min(low[u],disc[v]);
        }
    }
}
