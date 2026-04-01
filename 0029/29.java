class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long dvd = Math.abs((long)dividend), dvs = Math.abs((long)divisor);
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;
        long res = 0;
        while (dvd >= dvs) {
            long tmp = dvs, m = 1;
            while (dvd >= tmp<<1) { tmp <<= 1; m <<= 1; }
            dvd -= tmp; res += m;
        }
        return sign * (int)res;
    }
}