public class Solution {
    public int ReconstructOriginalDigitsFromE(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ReconstructOriginalDigitsFromE(root.left), ReconstructOriginalDigitsFromE(root.right));
    }
}