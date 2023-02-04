public class Solution {
    public int LongestCommonSuffixQueries(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestCommonSuffixQueries(root.left), LongestCommonSuffixQueries(root.right));
    }
}