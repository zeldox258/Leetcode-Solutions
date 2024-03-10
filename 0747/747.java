
class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = -1, max2 = -1, idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) { max2 = max1; max1 = nums[i]; idx = i; }
            else if (nums[i] > max2) max2 = nums[i];
        }
        return max1 >= 2 * max2 ? idx : -1;
    }
}
