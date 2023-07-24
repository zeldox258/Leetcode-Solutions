class Solution {
    public int solve3528(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3528(root.left),solve3528(root.right));
    }
}