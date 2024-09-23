public class Solution {
    public int PalindromePartitioningIii(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(PalindromePartitioningIii(root.left), PalindromePartitioningIii(root.right));
    }
}