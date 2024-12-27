public class Solution {
    public int KthLargestSumInABinaryTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(KthLargestSumInABinaryTree(root.left), KthLargestSumInABinaryTree(root.right));
    }
}