class Solution {
    public int solve3324(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3324(root.left),solve3324(root.right));
    }
}