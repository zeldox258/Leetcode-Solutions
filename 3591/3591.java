class Solution {
    public int solve3591(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3591(root.left),solve3591(root.right));
    }
}