
class Solution {
    public int shortestPathAllKeys(String[] grid) {
        int m = grid.length, n = grid[0].length, keys = 0;
        int sr = 0, sc = 0;
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
            char c = grid[i].charAt(j);
            if (c == '@') { sr = i; sc = j; }
            if (c >= 'a' && c <= 'f') keys |= 1 << (c - 'a');
        }
        int allKeys = keys;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc, 0, 0});
        Set<String> visited = new HashSet<>();
        visited.add(sr + "," + sc + ",0");
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int steps = 0;
        while (!q.isEmpty()) {
            for (int sz = q.size(); sz > 0; sz--) {
                int[] cur = q.poll(); int r = cur[0], c2 = cur[1], ks = cur[2];
                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c2 + d[1];
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                    char ch = grid[nr].charAt(nc);
                    if (ch == '#') continue;
                    if (ch >= 'A' && ch <= 'F' && (ks & (1 << (ch - 'A'))) == 0) continue;
                    int nks = ks; if (ch >= 'a' && ch <= 'f') nks |= 1 << (ch - 'a');
                    if (nks == allKeys) return steps + 1;
                    String key = nr + "," + nc + "," + nks;
                    if (!visited.contains(key)) { visited.add(key); q.offer(new int[]{nr, nc, nks}); }
                }
            }
            steps++;
        }
        return -1;
    }
}
