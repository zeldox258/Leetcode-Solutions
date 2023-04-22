public class Solution {
    public int MonotoneIncreasingDigits(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MonotoneIncreasingDigits(root.left), MonotoneIncreasingDigits(root.right));
    }
}