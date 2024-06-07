class Solution {
    public int solve1428(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1428(root.left),solve1428(root.right));
    }
}