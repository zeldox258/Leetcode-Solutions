public class Solution {
    public int PaintHouseIii(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(PaintHouseIii(root.left), PaintHouseIii(root.right));
    }
}