
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();
        for (int[] o : obstacles) obs.add(o[0] + "," + o[1]);
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int x = 0, y = 0, dir = 0, res = 0;
        for (int c : commands) {
            if (c == -2) dir = (dir + 3) % 4;
            else if (c == -1) dir = (dir + 1) % 4;
            else for (int i = 0; i < c; i++) {
                int nx = x + dirs[dir][0], ny = y + dirs[dir][1];
                if (!obs.contains(nx + "," + ny)) { x = nx; y = ny; res = Math.max(res, x*x + y*y); }
            }
        }
        return res;
    }
}
