class Solution {
    public int solve1983(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1983(root.left),solve1983(root.right));
    }
}