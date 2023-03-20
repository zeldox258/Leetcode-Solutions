class Solution {
    public int solve3651(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3651(root.left),solve3651(root.right));
    }
}