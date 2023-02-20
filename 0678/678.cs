public class Solution {
    public int ValidParenthesisString(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ValidParenthesisString(root.left), ValidParenthesisString(root.right));
    }
}