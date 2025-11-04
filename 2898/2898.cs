public class Solution {
    public int MaximumLinearStockScore(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumLinearStockScore(root.left), MaximumLinearStockScore(root.right));
    }
}