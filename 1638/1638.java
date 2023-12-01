class Solution {
    public int solve1638(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1638(root.left),solve1638(root.right));
    }
}