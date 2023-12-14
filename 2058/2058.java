class Solution {
    public int solve2058(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2058(root.left),solve2058(root.right));
    }
}