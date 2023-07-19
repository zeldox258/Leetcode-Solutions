class Solution {
    public int solve3771(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3771(root.left),solve3771(root.right));
    }
}