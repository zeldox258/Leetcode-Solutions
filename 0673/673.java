
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, maxLen = 0, res = 0;
        int[] len = new int[n], cnt = new int[n];
        Arrays.fill(len, 1); Arrays.fill(cnt, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (len[j] + 1 > len[i]) { len[i] = len[j] + 1; cnt[i] = cnt[j]; }
                    else if (len[j] + 1 == len[i]) cnt[i] += cnt[j];
                }
            }
            maxLen = Math.max(maxLen, len[i]);
        }
        for (int i = 0; i < n; i++) if (len[i] == maxLen) res += cnt[i];
        return res;
    }
}
