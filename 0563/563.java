
class Solution {
    int tilt = 0;
    public int findTilt(TreeNode root) { sum(root); return tilt; }
    int sum(TreeNode node) {
        if (node == null) return 0;
        int l = sum(node.left), r = sum(node.right);
        tilt += Math.abs(l - r);
        return node.val + l + r;
    }
}
