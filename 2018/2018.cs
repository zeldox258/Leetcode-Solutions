public class Solution {
    public int CheckIfWordCanBePlacedInCrossw(int[] nums, int k) {
        var map = new Dictionary<int, int>();
        map[0] = 1;
        int sum = 0, count = 0;
        foreach (int x in nums) {
            sum += x;
            if (map.ContainsKey(sum - k)) count += map[sum - k];
            map[sum] = map.GetValueOrDefault(sum) + 1;
        }
        return count;
    }
}