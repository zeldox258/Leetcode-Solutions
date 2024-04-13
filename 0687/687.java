
class Solution {
    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return res;
    }
    int dfs(TreeNode node) {
        if (node == null) return 0;
        int l = dfs(node.left), r = dfs(node.right);
        int lp = (node.left != null && node.left.val == node.val) ? l + 1 : 0;
        int rp = (node.right != null && node.right.val == node.val) ? r + 1 : 0;
        res = Math.max(res, lp + rp);
        return Math.max(lp, rp);
    }
}
