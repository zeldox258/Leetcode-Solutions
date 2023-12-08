public class Solution {
    public int MinimumNumberOfMovesToMakePali(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumNumberOfMovesToMakePali(root.left), MinimumNumberOfMovesToMakePali(root.right));
    }
}