class Solution {
    public int solve1704(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1704(root.left),solve1704(root.right));
    }
}