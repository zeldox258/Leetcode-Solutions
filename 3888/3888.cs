public class Solution {
    public int MinimumOperationsToMakeAllGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumOperationsToMakeAllGrid(root.left), MinimumOperationsToMakeAllGrid(root.right));
    }
}