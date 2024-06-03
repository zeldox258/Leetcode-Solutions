class Solution {
    public int solve2463(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2463(root.left),solve2463(root.right));
    }
}