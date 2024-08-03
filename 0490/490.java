
class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int m = maze.length, n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        visited[start[0]][start[1]] = true;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[0] == destination[0] && cur[1] == destination[1]) return true;
            for (int[] d : dirs) {
                int r = cur[0], c = cur[1];
                while (r+d[0]>=0 && r+d[0]<m && c+d[1]>=0 && c+d[1]<n && maze[r+d[0]][c+d[1]]==0) { r+=d[0]; c+=d[1]; }
                if (!visited[r][c]) { visited[r][c]=true; queue.offer(new int[]{r,c}); }
            }
        }
        return false;
    }
}
