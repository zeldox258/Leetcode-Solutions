public class Solution {
    public int LongestCommonSubsequence(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestCommonSubsequence(root.left), LongestCommonSubsequence(root.right));
    }
}