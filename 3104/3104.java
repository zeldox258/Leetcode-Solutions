class Solution {
    public int solve3104(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3104(root.left),solve3104(root.right));
    }
}