public class Solution {
    public int SeparateSquaresI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SeparateSquaresI(root.left), SeparateSquaresI(root.right));
    }
}