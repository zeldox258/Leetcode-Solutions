class Solution {
    public int solve2283(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2283(root.left),solve2283(root.right));
    }
}