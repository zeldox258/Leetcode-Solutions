public class Solution {
    private boolean isIncreasing(List<Integer> nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> arr, int len) {
        int size = arr.size();
        if (size < 2 * len) {
            return false;
        }
        for (int pos = 0; pos <= size - 2 * len; pos++) {
            if (isIncreasing(arr, pos, len) &&
                isIncreasing(arr, pos + len, len)) {
                return true;
            }
        }

        return false;
    }
}