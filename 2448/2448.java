class Solution {
    public int solve2448(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2448(root.left),solve2448(root.right));
    }
}