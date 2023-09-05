class Solution {
    public int solve3819(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3819(root.left),solve3819(root.right));
    }
}