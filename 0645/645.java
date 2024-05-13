
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] cnt = new int[nums.length+1];
        for (int n : nums) cnt[n]++;
        int dup = -1, miss = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (cnt[i] == 2) dup = i;
            if (cnt[i] == 0) miss = i;
        }
        return new int[]{dup, miss};
    }
}
