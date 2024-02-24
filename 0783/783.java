
class Solution {
    int res = Integer.MAX_VALUE; Integer prev = null;
    public int minDiffInBST(TreeNode root) { inorder(root); return res; }
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) res = Math.min(res, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }
}
