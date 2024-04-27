class Solution {
    public int solve3003(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3003(root.left),solve3003(root.right));
    }
}