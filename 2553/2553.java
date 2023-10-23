class Solution {
    public int solve2553(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2553(root.left),solve2553(root.right));
    }
}