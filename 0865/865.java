
class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root)[0];
    }
    TreeNode[] dfs(TreeNode node) {
        if (node == null) return new TreeNode[]{null, new TreeNode(0)};
        TreeNode[] l = dfs(node.left), r = dfs(node.right);
        int ld = l[1].val, rd = r[1].val;
        if (ld == rd) return new TreeNode[]{node, new TreeNode(ld + 1)};
        if (ld > rd) return new TreeNode[]{l[0], new TreeNode(ld + 1)};
        return new TreeNode[]{r[0], new TreeNode(rd + 1)};
    }
}
