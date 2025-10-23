public class Solution {
    public int MinimumMovesToEqualArrayElemen(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumMovesToEqualArrayElemen(root.left), MinimumMovesToEqualArrayElemen(root.right));
    }
}