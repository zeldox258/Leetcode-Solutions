public class Solution {
    public int MaxDotProductOfTwoSubsequences(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaxDotProductOfTwoSubsequences(root.left), MaxDotProductOfTwoSubsequences(root.right));
    }
}