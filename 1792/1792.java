class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        double sum = 0.0;

        for (int[] cls : classes) {
            int pass = cls[0], total = cls[1];
            double currentRatio = (double) pass / total;
            double gain = ((double) (pass + 1) / (total + 1)) - currentRatio;
            sum += currentRatio;
            maxHeap.offer(new double[]{gain, pass, total});
        }

        for (int i = 0; i < extraStudents; i++) {
            double[] top = maxHeap.poll();
            double gain = top[0];
            int pass = (int) top[1];
            int total = (int) top[2];

            sum -= (double) pass / total;
            pass++;
            total++;
            sum += (double) pass / total;

            double newGain = ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
            maxHeap.offer(new double[]{newGain, pass, total});
        }

        return sum / classes.length;
    }
}