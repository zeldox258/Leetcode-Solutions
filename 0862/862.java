
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length; int res = n + 1;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i+1] = prefix[i] + nums[i];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) res = Math.min(res, i - dq.pollFirst());
            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]) dq.pollLast();
            dq.addLast(i);
        }
        return res <= n ? res : -1;
    }
}
