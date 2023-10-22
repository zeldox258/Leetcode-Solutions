class Solution {
    public int solve3867(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3867(root.left),solve3867(root.right));
    }
}