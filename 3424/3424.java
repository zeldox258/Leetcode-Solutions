class Solution {
    public int solve3424(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3424(root.left),solve3424(root.right));
    }
}