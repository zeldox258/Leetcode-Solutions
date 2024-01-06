public class Solution {
    public int CousinsInBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CousinsInBinaryTree(root.left), CousinsInBinaryTree(root.right));
    }
}