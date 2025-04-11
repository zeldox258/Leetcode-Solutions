public class Solution {
    public int AddDigits(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(AddDigits(root.left), AddDigits(root.right));
    }
}