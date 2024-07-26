
class Solution {
    public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
        int m = maze.length, n = maze[0].length;
        int[][] dist = new int[m][n];
        String[][] path = new String[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[ball[0]][ball[1]] = 0; path[ball[0]][ball[1]] = "";
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> dist[a[0]][a[1]] != dist[b[0]][b[1]] ?
            dist[a[0]][a[1]] - dist[b[0]][b[1]] : path[a[0]][a[1]].compareTo(path[b[0]][b[1]]));
        pq.offer(new int[]{ball[0], ball[1]});
        int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
        String[] ds = {"u","r","d","l"};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int r = cur[0], c = cur[1];
            if (r == hole[0] && c == hole[1]) return path[r][c];
            for (int i = 0; i < 4; i++) {
                int nr = r, nc = c, nd = dist[r][c];
                String np = path[r][c] + ds[i];
                while (nr+dirs[i][0]>=0 && nr+dirs[i][0]<m && nc+dirs[i][1]>=0 && nc+dirs[i][1]<n
                       && maze[nr+dirs[i][0]][nc+dirs[i][1]]==0) {
                    nr+=dirs[i][0]; nc+=dirs[i][1]; nd++;
                    if (nr==hole[0] && nc==hole[1]) break;
                }
                if (nd < dist[nr][nc] || (nd == dist[nr][nc] && np.compareTo(path[nr][nc]) < 0)) {
                    dist[nr][nc] = nd; path[nr][nc] = np; pq.offer(new int[]{nr,nc});
                }
            }
        }
        return path[hole[0]][hole[1]] == null ? "impossible" : path[hole[0]][hole[1]];
    }
}
