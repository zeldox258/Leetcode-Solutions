
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) { depth(root); return max; }
    int depth(TreeNode node) {
        if (node == null) return 0;
        int l = depth(node.left), r = depth(node.right);
        max = Math.max(max, l + r);
        return 1 + Math.max(l, r);
    }
}
