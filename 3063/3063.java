class Solution {
    public int solve3063(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3063(root.left),solve3063(root.right));
    }
}