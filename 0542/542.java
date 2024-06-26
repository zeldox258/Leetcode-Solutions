
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
            if (mat[i][j] == 0) queue.offer(new int[]{i,j});
            else dist[i][j] = Integer.MAX_VALUE;
        }
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] d : dirs) {
                int ni=cur[0]+d[0], nj=cur[1]+d[1];
                if (ni>=0&&ni<m&&nj>=0&&nj<n&&dist[ni][nj]>dist[cur[0]][cur[1]]+1) {
                    dist[ni][nj]=dist[cur[0]][cur[1]]+1; queue.offer(new int[]{ni,nj});
                }
            }
        }
        return dist;
    }
}
