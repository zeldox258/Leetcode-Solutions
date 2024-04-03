class Solution {
    public int solve3213(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3213(root.left),solve3213(root.right));
    }
}