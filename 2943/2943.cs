public class Solution {
    public int MaximizeAreaOfSquareHoleInGrid(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximizeAreaOfSquareHoleInGrid(root.left), MaximizeAreaOfSquareHoleInGrid(root.right));
    }
}