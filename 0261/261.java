class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        int[] parent=new int[n];java.util.Arrays.fill(parent,-1);
        for(int[] e:edges){int x=find(parent,e[0]),y=find(parent,e[1]);if(x==y)return false;parent[x]=y;}
        return true;
    }
    int find(int[] p,int x){return p[x]==-1?x:find(p,p[x]);}
}