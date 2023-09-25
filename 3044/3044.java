class Solution {
    public int solve3044(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3044(root.left),solve3044(root.right));
    }
}