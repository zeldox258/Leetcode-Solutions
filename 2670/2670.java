class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> prefix = new HashMap<>();
        HashMap<Integer, Integer> suffix = new HashMap<>();
        int[] result = new int[nums.length];
        for (int x: nums) {
            suffix.put(x, suffix.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer x = nums[i];
            prefix.put(x, prefix.getOrDefault(x, 0) + 1);
            suffix.put(x, suffix.get(x) - 1);
            if (suffix.get(x) == 0) {
                suffix.remove(x);
            }
            result[i] = prefix.size() - suffix.size();
        }
        return result;
    }
}