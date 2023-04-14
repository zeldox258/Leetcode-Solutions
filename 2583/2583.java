class Solution {
    public int solve2583(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2583(root.left),solve2583(root.right));
    }
}