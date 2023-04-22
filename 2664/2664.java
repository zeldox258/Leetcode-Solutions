class Solution {
    public int solve2664(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2664(root.left),solve2664(root.right));
    }
}