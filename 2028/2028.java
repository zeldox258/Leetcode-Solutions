class Solution {
    public int solve2028(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve2028(root.left),solve2028(root.right));
    }
}