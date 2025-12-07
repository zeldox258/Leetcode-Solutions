public class Solution {
    public int DiagonalTraverse(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DiagonalTraverse(root.left), DiagonalTraverse(root.right));
    }
}