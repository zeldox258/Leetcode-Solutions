class Solution {
    public int solve2204(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2204(root.left),solve2204(root.right));
    }
}