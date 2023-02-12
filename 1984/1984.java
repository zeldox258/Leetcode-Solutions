class Solution {
    public int solve1984(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve1984(root.left),solve1984(root.right));
    }
}