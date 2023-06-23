
class Solution {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        int n=workers.length,m=bikes.length;
        java.util.List<int[]> dists=new java.util.ArrayList<>();
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) dists.add(new int[]{Math.abs(workers[i][0]-bikes[j][0])+Math.abs(workers[i][1]-bikes[j][1]),i,j});
        dists.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]!=b[1]?a[1]-b[1]:a[2]-b[2]);
        int[]res=new int[n]; java.util.Arrays.fill(res,-1); boolean[]bikeUsed=new boolean[m];
        int done=0; for(int[]d:dists){if(done==n)break;if(res[d[1]]==-1&&!bikeUsed[d[2]]){res[d[1]]=d[2];bikeUsed[d[2]]=true;done++;}}
        return res;
    }
}
