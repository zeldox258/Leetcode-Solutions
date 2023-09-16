class Solution {
    public int solve3831(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3831(root.left),solve3831(root.right));
    }
}