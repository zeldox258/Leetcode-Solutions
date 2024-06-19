class Solution {
    public int solve3228(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3228(root.left),solve3228(root.right));
    }
}