class Solution {
    public int solve1398(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1398(root.left),solve1398(root.right));
    }
}