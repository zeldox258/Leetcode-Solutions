
class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s = String.valueOf(n);
        int k = s.length(), d = digits.length;
        int[] dp = new int[k + 1];
        dp[k] = 1;
        for (int i = k - 1; i >= 0; i--) {
            char c = s.charAt(i);
            for (String dig : digits) {
                char dc = dig.charAt(0);
                if (dc < c) dp[i] += (int)Math.pow(d, k - i - 1);
                else if (dc == c) dp[i] += dp[i + 1];
            }
        }
        int res = dp[0], pow = 1;
        for (int i = 1; i < k; i++) { pow *= d; res += pow; }
        return res;
    }
}
