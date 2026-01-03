public class Solution {
    public int LengthOfLongestSubarrayWithAtM(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LengthOfLongestSubarrayWithAtM(root.left), LengthOfLongestSubarrayWithAtM(root.right));
    }
}