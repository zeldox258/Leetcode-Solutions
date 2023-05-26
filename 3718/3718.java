class Solution {
    int[] parent;
    public int solve3718(int n, int[][] edges) {
        parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        int comp=n;
        for(int[] e:edges){
            int a=find(e[0]),b=find(e[1]);
            if(a!=b){parent[a]=b;comp--;}
        }
        return comp;
    }
    int find(int x){return parent[x]==x?x:(parent[x]=find(parent[x]));}
}