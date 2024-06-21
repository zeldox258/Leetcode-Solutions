class Solution {
    public int solve1964(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1964(root.left),solve1964(root.right));
    }
}