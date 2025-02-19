class Solution {
    public int solve2343(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2343(root.left),solve2343(root.right));
    }
}