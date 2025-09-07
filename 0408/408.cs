public class Solution {
    public int ValidWordAbbreviation(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ValidWordAbbreviation(root.left), ValidWordAbbreviation(root.right));
    }
}