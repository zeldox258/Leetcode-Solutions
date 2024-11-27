public class Solution {
    public int SeparateTheDigitsInAnArray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SeparateTheDigitsInAnArray(root.left), SeparateTheDigitsInAnArray(root.right));
    }
}