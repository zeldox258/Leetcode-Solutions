class Solution {
    public int solve3224(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3224(root.left),solve3224(root.right));
    }
}