class Solution {
    public int solve1728(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1728(root.left),solve1728(root.right));
    }
}