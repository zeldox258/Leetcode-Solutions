
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) projects[i] = new int[]{capital[i], profits[i]};
        Arrays.sort(projects, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        for (int i = 0; i < k; i++) {
            while (idx < n && projects[idx][0] <= w) pq.offer(projects[idx++][1]);
            if (pq.isEmpty()) break;
            w += pq.poll();
        }
        return w;
    }
}
