class Solution {
    public int solve2624(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2624(root.left),solve2624(root.right));
    }
}