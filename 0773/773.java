
class Solution {
    public int slidingPuzzle(int[][] board) {
        String start = "", target = "123450";
        for (int[] row : board) for (int v : row) start += v;
        if (start.equals(target)) return 0;
        int[][] neighbors = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        Queue<String> q = new LinkedList<>(); q.offer(start);
        Set<String> visited = new HashSet<>(); visited.add(start);
        int steps = 0;
        while (!q.isEmpty()) {
            steps++;
            for (int i = q.size(); i > 0; i--) {
                String cur = q.poll(); int pos = cur.indexOf('0');
                for (int nb : neighbors[pos]) {
                    char[] arr = cur.toCharArray(); char tmp = arr[pos]; arr[pos] = arr[nb]; arr[nb] = tmp;
                    String next = new String(arr);
                    if (next.equals(target)) return steps;
                    if (!visited.contains(next)) { visited.add(next); q.offer(next); }
                }
            }
        }
        return -1;
    }
}
