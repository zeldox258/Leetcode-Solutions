class Solution {
    public int solve3807(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3807(root.left),solve3807(root.right));
    }
}