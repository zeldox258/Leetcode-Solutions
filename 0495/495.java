
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++)
            total += Math.min(duration, timeSeries[i+1] - timeSeries[i]);
        return total + duration;
    }
}
