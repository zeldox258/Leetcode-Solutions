class Solution {
    public int solve1623(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1623(root.left),solve1623(root.right));
    }
}