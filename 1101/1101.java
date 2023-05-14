
class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a,b)->a[0]-b[0]);
        int[] parent = new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        int groups = n;
        for(int[] log : logs) {
            int a=find(parent,log[1]), b=find(parent,log[2]);
            if(a!=b){ parent[a]=b; groups--; }
            if(groups==1) return log[0];
        }
        return -1;
    }
    int find(int[] p, int x){ return p[x]==x?x:(p[x]=find(p,p[x])); }
}
