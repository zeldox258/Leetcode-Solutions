class Solution {
    public int solve1848(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1848(root.left),solve1848(root.right));
    }
}