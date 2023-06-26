class Solution {
    public int solve1653(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1653(root.left),solve1653(root.right));
    }
}