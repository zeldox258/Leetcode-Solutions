class Solution {
    public int solve3699(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3699(root.left),solve3699(root.right));
    }
}