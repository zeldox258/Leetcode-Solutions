class Solution {
    public int solve723(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(solve723(root.left),solve723(root.right));
    }
}