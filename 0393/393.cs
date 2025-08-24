public class Solution {
    public int Utf8Validation(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(Utf8Validation(root.left), Utf8Validation(root.right));
    }
}