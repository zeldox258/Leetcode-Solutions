
class Solution {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for (int m : machines) total += m;
        int n = machines.length;
        if (total % n != 0) return -1;
        int avg = total / n, res = 0, sum = 0;
        for (int m : machines) {
            sum += m - avg;
            res = Math.max(res, Math.max(Math.abs(sum), m - avg));
        }
        return res;
    }
}
