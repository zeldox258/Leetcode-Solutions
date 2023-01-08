class Solution {
    public int solve3579(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3579(root.left),solve3579(root.right));
    }
}