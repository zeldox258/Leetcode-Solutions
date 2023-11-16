class Solution {
    public int solve3891(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3891(root.left),solve3891(root.right));
    }
}