class Solution {
    public int solve3735(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3735(root.left),solve3735(root.right));
    }
}