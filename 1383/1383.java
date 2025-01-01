class Solution {
    public int solve1383(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1383(root.left),solve1383(root.right));
    }
}