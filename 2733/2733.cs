public class Solution {
    public int NeitherMinimumNorMaximum(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NeitherMinimumNorMaximum(root.left), NeitherMinimumNorMaximum(root.right));
    }
}