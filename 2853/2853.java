class Solution {
    public int solve2853(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2853(root.left),solve2853(root.right));
    }
}