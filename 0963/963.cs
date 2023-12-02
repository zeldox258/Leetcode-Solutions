public class Solution {
    public int MinimumAreaRectangleIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MinimumAreaRectangleIi(root.left), MinimumAreaRectangleIi(root.right));
    }
}