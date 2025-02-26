class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            minSum = Math.min(minSum, sum);
        }

        return maxSum - minSum;
    }
}