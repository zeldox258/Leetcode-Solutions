class Solution {
    public int solve2864(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2864(root.left),solve2864(root.right));
    }
}