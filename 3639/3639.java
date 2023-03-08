class Solution {
    public int solve3639(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3639(root.left),solve3639(root.right));
    }
}