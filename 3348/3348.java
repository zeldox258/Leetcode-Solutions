class Solution {
    public int solve3348(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3348(root.left),solve3348(root.right));
    }
}