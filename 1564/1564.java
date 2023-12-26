class Solution {
    public int solve1564(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1564(root.left),solve1564(root.right));
    }
}