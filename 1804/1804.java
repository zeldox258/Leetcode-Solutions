class Solution {
    public int solve1804(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1804(root.left),solve1804(root.right));
    }
}