public class Solution {
    public int MinimumInversionCountInSubarra(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumInversionCountInSubarra(root.left), MinimumInversionCountInSubarra(root.right));
    }
}