class Solution {
    public int solve573(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve573(root.left),solve573(root.right));
    }
}