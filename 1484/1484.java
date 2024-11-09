class Solution {
    public int solve1484(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1484(root.left),solve1484(root.right));
    }
}