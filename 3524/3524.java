class Solution {
    public int solve3524(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3524(root.left),solve3524(root.right));
    }
}