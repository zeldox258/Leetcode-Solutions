class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { // => 6 = 110
                count++;
            }
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}