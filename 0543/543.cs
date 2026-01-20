public class Solution {
    public int DiameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(DiameterOfBinaryTree(root.left), DiameterOfBinaryTree(root.right));
    }
}