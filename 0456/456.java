
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] minLeft = new int[n];
        minLeft[0] = nums[0];
        for (int i = 1; i < n; i++) minLeft[i] = Math.min(minLeft[i-1], nums[i]);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int j = n - 1; j >= 0; j--) {
            int ak = Integer.MIN_VALUE;
            while (!stack.isEmpty() && stack.peek() < nums[j]) ak = stack.pop();
            if (ak > minLeft[j]) return true;
            stack.push(nums[j]);
        }
        return false;
    }
}
