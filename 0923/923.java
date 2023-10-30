
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long MOD = 1_000_000_007; long[] cnt = new long[101]; for (int v : arr) cnt[v]++;
        long res = 0;
        for (int i = 0; i <= 100; i++) for (int j = i; j <= 100; j++) {
            int k = target - i - j; if (k < j || k > 100) continue;
            if (i==j&&j==k) res += cnt[i]*(cnt[i]-1)*(cnt[i]-2)/6;
            else if (i==j) res += cnt[i]*(cnt[i]-1)/2*cnt[k];
            else if (j==k) res += cnt[i]*cnt[j]*(cnt[j]-1)/2;
            else res += cnt[i]*cnt[j]*cnt[k];
        }
        return (int)(res % MOD);
    }
}
