public class Solution {
    public int LongestCommonSubpath(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestCommonSubpath(root.left), LongestCommonSubpath(root.right));
    }
}