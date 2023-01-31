class Solution {
    public int solve3603(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3603(root.left),solve3603(root.right));
    }
}