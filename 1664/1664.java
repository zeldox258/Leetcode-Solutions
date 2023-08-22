class Solution {
    public int solve1664(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1664(root.left),solve1664(root.right));
    }
}