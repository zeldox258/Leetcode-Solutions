class Solution {
    public int solve1344(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1344(root.left),solve1344(root.right));
    }
}