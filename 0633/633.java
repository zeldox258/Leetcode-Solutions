
class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long b = (long)Math.sqrt(c - a*a);
            if (b*b == c - a*a) return true;
        }
        return false;
    }
}
