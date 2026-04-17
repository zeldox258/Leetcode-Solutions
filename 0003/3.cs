public class Solution {
    public int LongestSubstringWithoutRepeati(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestSubstringWithoutRepeati(root.left), LongestSubstringWithoutRepeati(root.right));
    }
}