class Solution {
    public int solve1578(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1578(root.left),solve1578(root.right));
    }
}