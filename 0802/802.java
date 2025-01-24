class Solution {

  public boolean dfs(int node,int[][]mat,int vis[],int pvis[],int check[]){
    vis[node]=1;
    pvis[node]=1;

    for(int x:mat[node]){
        if(vis[x]!=1){
            if(dfs(x,mat,vis,pvis,check)){
                return true;
            }
        }
        else if(pvis[x]==1){
            return true;
        }
    }
    pvis[node]=0;
    check[node]=1;
    return false;
  }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int vis []=new int[graph.length];
        int check[]=new int[graph.length];
        int pvis[]=new int[graph.length];

    for(int i = 0;i<graph.length;i++){
        if(vis[i]!=1){
            boolean test = dfs(i,graph,vis,pvis,check);
        }
    }
    ArrayList<Integer>ans=new ArrayList<>();
    for(int i = 0;i<graph.length;i++){
        if(check[i]==1){
            ans.add(i);
        }
    }
    return ans;

    }
}