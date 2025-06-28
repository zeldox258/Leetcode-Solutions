
class Solution {
    public int rob(TreeNode root) {
        int[] res=dfs(root);
        return Math.max(res[0],res[1]);
    }
    int[] dfs(TreeNode node) {
        if (node==null) return new int[]{0,0};
        int[] l=dfs(node.left), r=dfs(node.right);
        int notRob=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        int rob=node.val+l[0]+r[0];
        return new int[]{notRob,rob};
    }
}
