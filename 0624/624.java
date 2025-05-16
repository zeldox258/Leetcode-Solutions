class Solution {
    public int solve624(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve624(root.left),solve624(root.right));
    }
}