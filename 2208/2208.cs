public class Solution {
    public int MinimumOperationsToHalveArrayS(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumOperationsToHalveArrayS(root.left), MinimumOperationsToHalveArrayS(root.right));
    }
}