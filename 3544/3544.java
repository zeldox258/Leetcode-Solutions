class Solution {
    public int solve3544(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3544(root.left),solve3544(root.right));
    }
}