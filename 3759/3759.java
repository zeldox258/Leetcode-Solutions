class Solution {
    public int solve3759(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3759(root.left),solve3759(root.right));
    }
}