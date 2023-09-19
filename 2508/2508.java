class Solution {
    public int solve2508(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2508(root.left),solve2508(root.right));
    }
}