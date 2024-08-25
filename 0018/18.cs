public class Solution {
    public int 4sum(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(4sum(root.left), 4sum(root.right));
    }
}