class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {

        int ans = nums.length +1;
        int left = 0;
        int val = 0;

        for (int right = 0; right < nums.length; right++) {

            val |= nums[right];

            while (val >= k && left <= right) {
                ans = Math.min(ans, right - left + 1);
                while(left+1 < nums.length && nums[left] == nums[left+1] ) {
                    left++;
                }

                val = 0;
                for (int i = left + 1; i <= right; i++) {
                    val |= nums[i];
                }

                left++;
            }
        }

        return ans == nums.length +1? -1: ans;
    }
}
