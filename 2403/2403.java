class Solution {
    public int solve2403(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2403(root.left),solve2403(root.right));
    }
}