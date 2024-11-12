class Solution {
    public int solve2964(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2964(root.left),solve2964(root.right));
    }
}