public class Solution {
    public int FindTheLeastFrequentDigit(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheLeastFrequentDigit(root.left), FindTheLeastFrequentDigit(root.right));
    }
}