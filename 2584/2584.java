class Solution {
    public int solve2584(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2584(root.left),solve2584(root.right));
    }
}