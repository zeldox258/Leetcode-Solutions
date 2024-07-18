class Solution {
    public int solve2253(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2253(root.left),solve2253(root.right));
    }
}