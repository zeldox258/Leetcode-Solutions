public class Solution {
    public int MaximumProductOfWordLengths(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumProductOfWordLengths(root.left), MaximumProductOfWordLengths(root.right));
    }
}