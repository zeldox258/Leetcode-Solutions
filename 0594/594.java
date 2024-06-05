
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int n : nums) cnt.merge(n, 1, Integer::sum);
        int res = 0;
        for (int key : cnt.keySet())
            if (cnt.containsKey(key+1)) res = Math.max(res, cnt.get(key) + cnt.get(key+1));
        return res;
    }
}
