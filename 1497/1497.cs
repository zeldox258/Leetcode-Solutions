public class Solution {
    public int CheckIfArrayPairsAreDivisibleB(int[][] intervals) {
        Array.Sort(intervals, (a, b) => a[1] - b[1]);
        int count = 1, end = intervals[0][1];
        for (int i = 1; i < intervals.Length; i++) {
            if (intervals[i][0] >= end) { count++; end = intervals[i][1]; }
        }
        return count;
    }
}