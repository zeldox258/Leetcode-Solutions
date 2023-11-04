class Solution {
    public int solve3879(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3879(root.left),solve3879(root.right));
    }
}