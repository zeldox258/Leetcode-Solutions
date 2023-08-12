class Solution {
    public int solve3795(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3795(root.left),solve3795(root.right));
    }
}