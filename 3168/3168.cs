public class Solution {
    public int MinimumNumberOfChairsInAWaitin(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumNumberOfChairsInAWaitin(root.left), MinimumNumberOfChairsInAWaitin(root.right));
    }
}