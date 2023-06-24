class Solution {
    public int solve3747(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3747(root.left),solve3747(root.right));
    }
}