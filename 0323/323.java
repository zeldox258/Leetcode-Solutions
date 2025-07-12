
class Solution {
    int[] parent;
    public int countComponents(int n, int[][] edges) {
        parent = new int[n];
        for (int i=0;i<n;i++) parent[i]=i;
        int comp=n;
        for (int[] e:edges) { int pa=find(e[0]),pb=find(e[1]); if(pa!=pb){parent[pa]=pb;comp--;} }
        return comp;
    }
    int find(int x) { if(parent[x]!=x) parent[x]=find(parent[x]); return parent[x]; }
}
