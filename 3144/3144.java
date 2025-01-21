class Solution {
    public int solve3144(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3144(root.left),solve3144(root.right));
    }
}