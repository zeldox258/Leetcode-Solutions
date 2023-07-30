class Solution {
    public int solve3783(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3783(root.left),solve3783(root.right));
    }
}