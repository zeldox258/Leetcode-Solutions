
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            int slow = i, fast = next(nums, i);
            while (nums[slow] * nums[fast] > 0 && nums[slow] * nums[next(nums, fast)] > 0) {
                if (slow == fast) {
                    if (slow == next(nums, slow)) break;
                    return true;
                }
                slow = next(nums, slow);
                fast = next(nums, next(nums, fast));
            }
        }
        return false;
    }
    int next(int[] nums, int i) {
        int n = nums.length;
        return ((i + nums[i]) % n + n) % n;
    }
}
