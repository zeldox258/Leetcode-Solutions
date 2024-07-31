class Solution {
    public int solve644(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve644(root.left),solve644(root.right));
    }
}