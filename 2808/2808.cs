public class Solution {
    public int MinimumSecondsToEqualizeACircu(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumSecondsToEqualizeACircu(root.left), MinimumSecondsToEqualizeACircu(root.right));
    }
}