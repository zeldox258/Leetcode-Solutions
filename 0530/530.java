
class Solution {
    int prev = -1, minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root); return minDiff;
    }
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != -1) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }
}
