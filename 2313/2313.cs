public class Solution {
    public int MinimumFlipsInBinaryTreeToGetR(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumFlipsInBinaryTreeToGetR(root.left), MinimumFlipsInBinaryTreeToGetR(root.right));
    }
}