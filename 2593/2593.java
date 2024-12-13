class Solution {
    public long findScore(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int s = i;
            while (i + 1 < nums.length && nums[i + 1] < nums[i]) i++;
            for (int j = i; j >= s; j -= 2) res += nums[j];
        }
        return res;
    }
}