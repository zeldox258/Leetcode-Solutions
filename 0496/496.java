
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) map.put(stack.pop(), n);
            stack.push(n);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) res[i] = map.getOrDefault(nums1[i], -1);
        return res;
    }
}
