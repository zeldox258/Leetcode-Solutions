class Solution {
    public int solve3687(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3687(root.left),solve3687(root.right));
    }
}