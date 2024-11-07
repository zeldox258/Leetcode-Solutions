public class Solution {
    public int RestoreIpAddresses(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RestoreIpAddresses(root.left), RestoreIpAddresses(root.right));
    }
}