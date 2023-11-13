class Solution {
    public int solve2524(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2524(root.left),solve2524(root.right));
    }
}