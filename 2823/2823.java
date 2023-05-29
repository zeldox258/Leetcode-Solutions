class Solution {
    public int solve2823(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2823(root.left),solve2823(root.right));
    }
}