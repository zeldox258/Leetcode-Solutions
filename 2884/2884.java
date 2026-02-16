class Solution {
    public int solve2884(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2884(root.left),solve2884(root.right));
    }
}