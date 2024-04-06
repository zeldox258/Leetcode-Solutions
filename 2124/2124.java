class Solution {
    public int solve2124(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2124(root.left),solve2124(root.right));
    }
}