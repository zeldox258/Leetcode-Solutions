class Solution {
    public int solve2088(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2088(root.left),solve2088(root.right));
    }
}