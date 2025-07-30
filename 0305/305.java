
import java.util.*;
class Solution {
    int[] parent, rank, size;
    int islands = 0;
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        parent = new int[m*n]; rank = new int[m*n]; size = new int[m*n];
        Arrays.fill(parent, -1);
        List<Integer> res = new ArrayList<>();
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int[] pos : positions) {
            int x = pos[0], y = pos[1], id = x*n+y;
            if (parent[id] == -1) {
                parent[id] = id; size[id] = 1; islands++;
                for (int[] d : dirs) {
                    int nx = x+d[0], ny = y+d[1], nid = nx*n+ny;
                    if (nx>=0&&nx<m&&ny>=0&&ny<n&&parent[nid]!=-1) {
                        int pa = find(id), pb = find(nid);
                        if (pa != pb) { union(pa,pb); islands--; }
                    }
                }
            }
            res.add(islands);
        }
        return res;
    }
    int find(int x) { if (parent[x]!=x) parent[x]=find(parent[x]); return parent[x]; }
    void union(int a, int b) {
        if (rank[a]<rank[b]) { int t=a;a=b;b=t; }
        parent[b]=a; if(rank[a]==rank[b]) rank[a]++;
    }
}
