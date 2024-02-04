class Solution {
    public int solve1424(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1424(root.left),solve1424(root.right));
    }
}