class Solution {
    public int solve1893(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1893(root.left),solve1893(root.right));
    }
}