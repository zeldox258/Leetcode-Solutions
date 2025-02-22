class Solution {
    int mx= Integer.MIN_VALUE;
    public void dfs2(ArrayList<Integer> adj[], int s, int p, int pre, int dis[], int disB[], int amount[], int dd){
        if(disB[s]<dd)
            dis[s]= pre;
        else if(disB[s]== dd)
            dis[s]= pre+amount[s]/2;
        else
            dis[s]= pre+amount[s];
        for(int i= 0;i<adj[s].size();i++){
            if(adj[s].get(i) == p)
                continue;
            dfs2(adj, adj[s].get(i), s, dis[s], dis, disB, amount, dd+1);
        }
        if(adj[s].size() == 1 && s!= 0)
            mx= Math.max(mx, dis[s]);
    }
    boolean dfs(ArrayList<Integer> adj[], int s, int p, int disB[], int pre, int d){
        if(s== d){
            disB[s]= pre;
            return true;
        }
        for(int i= 0;i<adj[s].size();i++){
            if(adj[s].get(i).intValue()== p) continue;
            if(dfs(adj, adj[s].get(i), s, disB, pre+1, d)){ disB[s]= pre; return true;}
        }
        return false;
    }
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        mx= Integer.MIN_VALUE;
        int n= amount.length;
        ArrayList<Integer> []adj= new ArrayList[n];
        for(int i= 0;i<n;i++)
            adj[i]= new ArrayList<Integer>();
        for(int i= 0;i<edges.length;i++){
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        int disB[]= new int[n];
        Arrays.fill(disB, Integer.MAX_VALUE);
        int dis[]= new int[n];
        dfs(adj, bob, -1, disB, 1, 0);
        dfs2(adj, 0, -1, 0, dis, disB, amount, 1);
        return mx;
    }
}