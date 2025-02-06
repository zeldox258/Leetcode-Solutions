class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[nums.length-1]-nums[0]);
        for(int i=1; i<nums.length; i++) {
            int num = Math.abs(nums[i-1]-nums[i]);
            max = Math.max(num, max);
        }

        return max;
    }
}