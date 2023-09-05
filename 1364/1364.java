class Solution {
    public int solve1364(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1364(root.left),solve1364(root.right));
    }
}