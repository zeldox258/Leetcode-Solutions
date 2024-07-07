
class Solution {
    int count = 0;
    public int countArrangement(int n) {
        dfs(n, 1, new boolean[n+1]);
        return count;
    }
    void dfs(int n, int pos, boolean[] visited) {
        if (pos > n) { count++; return; }
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                dfs(n, pos+1, visited);
                visited[i] = false;
            }
        }
    }
}
