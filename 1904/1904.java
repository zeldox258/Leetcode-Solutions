class Solution {
    public int solve1904(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1904(root.left),solve1904(root.right));
    }
}