class Solution {
    public int solve2478(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2478(root.left),solve2478(root.right));
    }
}