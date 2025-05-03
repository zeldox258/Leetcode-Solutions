class Solution {
    public int solve483(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve483(root.left),solve483(root.right));
    }
}