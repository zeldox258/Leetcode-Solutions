class Solution {
    public int solve3615(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3615(root.left),solve3615(root.right));
    }
}