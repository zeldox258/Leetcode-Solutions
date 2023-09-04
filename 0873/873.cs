public class Solution {
    public int LengthOfLongestFibonacciSubseq(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LengthOfLongestFibonacciSubseq(root.left), LengthOfLongestFibonacciSubseq(root.right));
    }
}