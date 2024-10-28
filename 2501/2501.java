class Solution {
    public int longestSquareStreak(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            dict.put(num, (num > 1000 ? 0 : dict.getOrDefault(num * num, 0)) + 1);
        }

        int max = dict.values().stream().max(Integer::compareTo).orElse(1);
        return max == 1 ? -1 : max;
    }
}