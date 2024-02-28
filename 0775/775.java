
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int maxVal = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            if (maxVal > nums[i + 2]) return false;
        }
        return true;
    }
}
