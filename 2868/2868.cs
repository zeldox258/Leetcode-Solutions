public class Solution {
    public int TheWordingGame(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TheWordingGame(root.left), TheWordingGame(root.right));
    }
}