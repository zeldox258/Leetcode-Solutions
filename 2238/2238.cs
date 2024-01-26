public class Solution {
    public int NumberOfTimesADriverWasAPassen(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfTimesADriverWasAPassen(root.left), NumberOfTimesADriverWasAPassen(root.right));
    }
}