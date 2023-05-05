class Solution {
    public int solve603(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve603(root.left),solve603(root.right));
    }
}