class Solution {
    public int solve1443(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1443(root.left),solve1443(root.right));
    }
}