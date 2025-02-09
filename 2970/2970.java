class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int leftIndex = 0, n = nums.length;

        while (leftIndex + 1 < n && nums[leftIndex] < nums[leftIndex + 1]) {
              leftIndex++;
        }

        if (leftIndex == n - 1) {
            return n * (n + 1) / 2;
        }

        int result = leftIndex + 2;

        for (int rightIndex = n - 1; rightIndex > 0; --rightIndex) {

            while (leftIndex >= 0 && nums[leftIndex] >= nums[rightIndex]) {
                leftIndex--;
            }

            result += leftIndex + 2;

            if (nums[rightIndex - 1] >= nums[rightIndex]) {
                break;
            }
        }
        return result;
    }
}