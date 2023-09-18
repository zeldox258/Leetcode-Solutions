class Solution {
    public int solve1773(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1773(root.left),solve1773(root.right));
    }
}