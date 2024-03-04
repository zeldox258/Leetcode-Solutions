class Solution {
    public int solve2444(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2444(root.left),solve2444(root.right));
    }
}