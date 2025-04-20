class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else if (nums[i] > 0) {
                int idx = (i + nums[i]) % nums.length;
                result[i] = nums[idx];
            } else {
                int idx = (nums.length + (i + nums[i]) % nums.length) % nums.length;
                result[i] = nums[idx];
            }
        }
        return result;
    }
}