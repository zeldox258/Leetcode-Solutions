public class Solution {
    public int LongestFibonacciSubarray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LongestFibonacciSubarray(root.left), LongestFibonacciSubarray(root.right));
    }
}