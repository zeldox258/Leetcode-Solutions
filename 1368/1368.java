class Solution {
    public int solve1368(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1368(root.left),solve1368(root.right));
    }
}