
class Solution {
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums); int n = nums.length, MOD = 1_000_000_007; long res = 0;
        long[] pow2 = new long[n]; pow2[0] = 1;
        for (int i = 1; i < n; i++) pow2[i] = pow2[i-1] * 2 % MOD;
        for (int i = 0; i < n; i++) res = (res + (pow2[i] - pow2[n-1-i]) * nums[i]) % MOD;
        return (int)((res + MOD) % MOD);
    }
}
