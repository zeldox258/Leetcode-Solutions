class Solution {
    public int solve3124(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3124(root.left),solve3124(root.right));
    }
}