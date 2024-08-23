
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2], moves = 0;
        for (int n : nums) moves += Math.abs(n - median);
        return moves;
    }
}
