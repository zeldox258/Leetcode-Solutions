class Solution {
    public int solve3464(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3464(root.left),solve3464(root.right));
    }
}