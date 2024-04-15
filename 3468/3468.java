class Solution {
    public int solve3468(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3468(root.left),solve3468(root.right));
    }
}