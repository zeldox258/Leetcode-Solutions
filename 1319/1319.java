
class Solution {
    int[] parent;
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        parent=new int[n]; for(int i=0;i<n;i++) parent[i]=i;
        int extra=0;
        for(int[] c:connections){ int a=find(c[0]),b=find(c[1]); if(a==b)extra++;else parent[a]=b; }
        int components=0; for(int i=0;i<n;i++) if(find(i)==i) components++;
        return components-1<=extra?components-1:-1;
    }
    int find(int x){return parent[x]==x?x:(parent[x]=find(parent[x]));}
}
