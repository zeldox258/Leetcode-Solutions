public class Solution {
    public int RingsAndRods(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RingsAndRods(root.left), RingsAndRods(root.right));
    }
}