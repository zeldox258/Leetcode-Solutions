
class Solution {
    int[]parent,size;
    public int minMalwareSpread(int[][] graph, int[] initial) {
        int n=graph.length; parent=new int[n]; size=new int[n]; java.util.Arrays.fill(size,1); for(int i=0;i<n;i++) parent[i]=i;
        for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) if(graph[i][j]==1) union(i,j);
        java.util.Arrays.sort(initial); int[]cnt=new int[n]; for(int v:initial) cnt[find(v)]++;
        int res=initial[0],maxSave=0;
        for(int v:initial){int root=find(v);if(cnt[root]==1){if(size[root]>maxSave||(size[root]==maxSave&&v<res)){maxSave=size[root];res=v;}}}
        return res;
    }
    int find(int x){if(parent[x]!=x)parent[x]=find(parent[x]);return parent[x];}
    void union(int a,int b){a=find(a);b=find(b);if(a==b)return;if(size[a]<size[b]){int t=a;a=b;b=t;}parent[b]=a;size[a]+=size[b];}
}
