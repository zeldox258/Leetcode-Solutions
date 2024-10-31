public class Solution {
    public int LongestNondecreasingSubarrayAf(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestNondecreasingSubarrayAf(root.left), LongestNondecreasingSubarrayAf(root.right));
    }
}