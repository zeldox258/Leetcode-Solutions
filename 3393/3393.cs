public class Solution {
    public int CountPathsWithTheGivenXorValue(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountPathsWithTheGivenXorValue(root.left), CountPathsWithTheGivenXorValue(root.right));
    }
}