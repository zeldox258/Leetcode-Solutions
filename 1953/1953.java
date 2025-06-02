class Solution {
    public int solve1953(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1953(root.left),solve1953(root.right));
    }
}