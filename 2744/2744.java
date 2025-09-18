class Solution {
    public int solve2744(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2744(root.left),solve2744(root.right));
    }
}