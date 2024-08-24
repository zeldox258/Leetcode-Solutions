public class Solution {
    public int CountNumberOfNiceSubarrays(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountNumberOfNiceSubarrays(root.left), CountNumberOfNiceSubarrays(root.right));
    }
}