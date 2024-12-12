public class Solution {
    public int MinimumImpossibleOr(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumImpossibleOr(root.left), MinimumImpossibleOr(root.right));
    }
}