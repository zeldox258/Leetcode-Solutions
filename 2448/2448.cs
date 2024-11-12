public class Solution {
    public int MinimumCostToMakeArrayEqual(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumCostToMakeArrayEqual(root.left), MinimumCostToMakeArrayEqual(root.right));
    }
}