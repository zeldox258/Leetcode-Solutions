class Solution {
    public int solve2824(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2824(root.left),solve2824(root.right));
    }
}