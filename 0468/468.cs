public class Solution {
    public int ValidateIpAddress(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ValidateIpAddress(root.left), ValidateIpAddress(root.right));
    }
}