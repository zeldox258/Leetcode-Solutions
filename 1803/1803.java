class Solution {
    public int solve1803(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1803(root.left),solve1803(root.right));
    }
}