
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>(); cnt.put(0,1);
        int sum = 0, res = 0;
        for (int v : nums) { sum += v; res += cnt.getOrDefault(sum-goal,0); cnt.merge(sum,1,Integer::sum); }
        return res;
    }
}
