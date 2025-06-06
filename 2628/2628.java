class Solution {
    public int solve2628(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2628(root.left),solve2628(root.right));
    }
}