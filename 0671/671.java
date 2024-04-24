
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return -1;
        int l = root.left.val, r = root.right.val;
        if (l == root.val) l = findSecondMinimumValue(root.left);
        if (r == root.val) r = findSecondMinimumValue(root.right);
        if (l != -1 && r != -1) return Math.min(l, r);
        return l != -1 ? l : r;
    }
}
