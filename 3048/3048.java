class Solution {
    public int solve3048(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3048(root.left),solve3048(root.right));
    }
}