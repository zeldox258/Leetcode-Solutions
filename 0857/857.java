
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] workers = new double[n][2];
        for (int i = 0; i < n; i++) workers[i] = new double[]{(double)wage[i]/quality[i], quality[i]};
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sumQ = 0, res = Double.MAX_VALUE;
        for (double[] w : workers) {
            pq.offer(w[1]); sumQ += w[1];
            if (pq.size() > k) sumQ -= pq.poll();
            if (pq.size() == k) res = Math.min(res, w[0] * sumQ);
        }
        return res;
    }
}
