public class Solution {
    public int GameOfNim(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(GameOfNim(root.left), GameOfNim(root.right));
    }
}