class Solution {
    public int solve2604(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2604(root.left),solve2604(root.right));
    }
}