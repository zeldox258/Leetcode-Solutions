class Solution {
    public int solve3855(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3855(root.left),solve3855(root.right));
    }
}