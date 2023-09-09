class Solution {
    public int solve1923(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1923(root.left),solve1923(root.right));
    }
}