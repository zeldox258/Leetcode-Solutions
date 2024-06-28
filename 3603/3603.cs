public class Solution {
    public int MinimumCostPathWithAlternating(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumCostPathWithAlternating(root.left), MinimumCostPathWithAlternating(root.right));
    }
}