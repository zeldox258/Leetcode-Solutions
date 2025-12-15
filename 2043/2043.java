class Solution {
    public int solve2043(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2043(root.left),solve2043(root.right));
    }
}