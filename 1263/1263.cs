public class Solution {
    public int MinimumMovesToMoveABoxToTheirT(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumMovesToMoveABoxToTheirT(root.left), MinimumMovesToMoveABoxToTheirT(root.right));
    }
}