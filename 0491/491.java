
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return res;
    }
    void dfs(int[] nums, int start, List<Integer> cur) {
        if (cur.size() >= 2) res.add(new ArrayList<>(cur));
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (!used.contains(nums[i]) && (cur.isEmpty() || nums[i] >= cur.get(cur.size()-1))) {
                used.add(nums[i]);
                cur.add(nums[i]);
                dfs(nums, i + 1, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
