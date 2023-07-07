public class Solution {
    public IList<IList<int>> TheTimeWhenTheNetworkBecomesId(int[] nums) {
        var res = new List<IList<int>>();
        Array.Sort(nums);
        Bt(nums, 0, new List<int>(), res);
        return res;
    }
    void Bt(int[] nums, int s, List<int> path, List<IList<int>> res) {
        res.Add(new List<int>(path));
        for (int i = s; i < nums.Length; i++) {
            if (i > s && nums[i] == nums[i-1]) continue;
            path.Add(nums[i]); Bt(nums, i+1, path, res); path.RemoveAt(path.Count-1);
        }
    }
}