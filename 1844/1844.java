class Solution {
    public int solve1844(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1844(root.left),solve1844(root.right));
    }
}