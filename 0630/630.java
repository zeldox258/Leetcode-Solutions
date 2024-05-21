
class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int time = 0;
        for (int[] c : courses) {
            if (c[0] <= c[1]) {
                pq.offer(c[0]); time += c[0];
                if (time > c[1]) time -= pq.poll();
            }
        }
        return pq.size();
    }
}
