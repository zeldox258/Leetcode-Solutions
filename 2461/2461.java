class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long result = 0;
        long currWindowSum = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j < nums.length) {
            while (set.contains(nums[j])) {
                currWindowSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            currWindowSum += nums[j];
            set.add(nums[j]);

            if (j - i + 1 == k) {
                result = Math.max(result, currWindowSum);

                currWindowSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            j++;
        }
        return result;
    }
}