
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length, target = n * n;
        boolean[] visited = new boolean[target + 1];
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        q.offer(1); visited[1] = true; int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int curr = q.poll(); if (curr == target) return steps;
                for (int d = 1; d <= 6 && curr + d <= target; d++) {
                    int next = curr + d, pos = next - 1;
                    int row = n - 1 - pos / n, col = (pos / n) % 2 == 0 ? pos % n : n - 1 - pos % n;
                    if (board[row][col] != -1) next = board[row][col];
                    if (!visited[next]) { visited[next] = true; q.offer(next); }
                }
            }
            steps++;
        }
        return -1;
    }
}
