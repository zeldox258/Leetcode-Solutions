class Solution {
    public int solve3363(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3363(root.left),solve3363(root.right));
    }
}