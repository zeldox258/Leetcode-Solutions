class Solution {
    public int solve3663(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3663(root.left),solve3663(root.right));
    }
}