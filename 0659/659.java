
class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(), need = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        for (int n : nums) {
            if (freq.get(n) == 0) continue;
            if (need.getOrDefault(n, 0) > 0) {
                need.put(n, need.get(n) - 1);
                need.put(n + 1, need.getOrDefault(n + 1, 0) + 1);
            } else if (freq.getOrDefault(n + 1, 0) > 0 && freq.getOrDefault(n + 2, 0) > 0) {
                freq.put(n + 1, freq.get(n + 1) - 1);
                freq.put(n + 2, freq.get(n + 2) - 1);
                need.put(n + 3, need.getOrDefault(n + 3, 0) + 1);
            } else return false;
            freq.put(n, freq.get(n) - 1);
        }
        return true;
    }
}
