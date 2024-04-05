
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % k != 0) return false;
        return backtrack(nums, new int[k], 0, sum / k);
    }
    boolean backtrack(int[] nums, int[] buckets, int idx, int target) {
        if (idx == nums.length) { for (int b : buckets) if (b != target) return false; return true; }
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < buckets.length; i++) {
            if (seen.contains(buckets[i])) continue;
            if (buckets[i] + nums[idx] <= target) {
                seen.add(buckets[i]);
                buckets[i] += nums[idx];
                if (backtrack(nums, buckets, idx + 1, target)) return true;
                buckets[i] -= nums[idx];
            }
        }
        return false;
    }
}
