class Solution {
    public int solve544(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve544(root.left),solve544(root.right));
    }
}