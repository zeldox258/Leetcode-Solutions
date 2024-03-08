class Solution {
    public int solve3513(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3513(root.left),solve3513(root.right));
    }
}