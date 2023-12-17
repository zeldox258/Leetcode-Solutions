public class Solution {
    public int MaximizeSum(int[] nums, int k) {
        int max = nums.Max();
        int result = max;
        for (int i = 1; i < k; i++) {
            result += ++max;
        }
        return result;
    }
}