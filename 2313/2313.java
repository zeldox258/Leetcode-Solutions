class Solution {
    public int solve2313(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2313(root.left),solve2313(root.right));
    }
}