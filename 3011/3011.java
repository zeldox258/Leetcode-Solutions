class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        int prevMax = 0, currMax = nums[0];

        for(int i=1; i<n; ++i) {
            if(Integer.bitCount(nums[i-1]) == Integer.bitCount(nums[i])) {
                currMax = Math.max(currMax, nums[i]);
            } else {
                prevMax = currMax;
                currMax = nums[i];
            }

            if(prevMax > nums[i]) {
                return false;
            }
        }

        return true;
    }
}