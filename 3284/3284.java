class Solution {
    public int solve3284(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3284(root.left),solve3284(root.right));
    }
}