class Solution {
    public int solve2144(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2144(root.left),solve2144(root.right));
    }
}