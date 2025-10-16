class Solution {
    public int solve1444(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1444(root.left),solve1444(root.right));
    }
}