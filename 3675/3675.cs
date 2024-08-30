public class Solution {
    public int[] MinimumOperationsToTransformSt(int[] nums, int target) {
        var map = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++) {
            if (map.TryGetValue(target - nums[i], out int j)) return new[] {j, i};
            map[nums[i]] = i;
        }
        return Array.Empty<int>();
    }
}