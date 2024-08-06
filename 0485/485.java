
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int n : nums) {
            if (n == 1) max = Math.max(max, ++cur);
            else cur = 0;
        }
        return max;
    }
}
