
class Solution {
    public int minimumCost(int n, int[][] connections) {
        Arrays.sort(connections,(a,b)->a[2]-b[2]);
        int[] parent=new int[n+1];
        for(int i=0;i<=n;i++) parent[i]=i;
        int cost=0,edges=0;
        for(int[] c:connections){
            int a=find(parent,c[0]),b=find(parent,c[1]);
            if(a!=b){ parent[a]=b; cost+=c[2]; edges++; }
            if(edges==n-1) return cost;
        }
        return -1;
    }
    int find(int[] p,int x){ return p[x]==x?x:(p[x]=find(p,p[x])); }
}
