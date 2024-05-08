
class Solution {
    public int minSteps(int n) {
        int res = 0;
        for (int d = 2; d <= n; d++) {
            while (n % d == 0) { res += d; n /= d; }
        }
        return res;
    }
}
