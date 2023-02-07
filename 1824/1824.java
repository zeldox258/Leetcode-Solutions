class Solution {
    public int solve1824(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1824(root.left),solve1824(root.right));
    }
}