class Solution {
    public int solve2373(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2373(root.left),solve2373(root.right));
    }
}