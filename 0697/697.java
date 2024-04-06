
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>(), last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            count.put(n, count.getOrDefault(n, 0) + 1);
            first.putIfAbsent(n, i);
            last.put(n, i);
        }
        int deg = Collections.max(count.values()), res = nums.length;
        for (int n : count.keySet()) if (count.get(n) == deg) res = Math.min(res, last.get(n) - first.get(n) + 1);
        return res;
    }
}
