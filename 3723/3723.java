class Solution {
    public int solve3723(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve3723(root.left),solve3723(root.right));
    }
}