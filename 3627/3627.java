class Solution {
    public int solve3627(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3627(root.left),solve3627(root.right));
    }
}