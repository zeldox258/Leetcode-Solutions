class Solution {
    public int solve3084(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3084(root.left),solve3084(root.right));
    }
}