public class Solution {
    public int ExcelSheetColumnTitle(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ExcelSheetColumnTitle(root.left), ExcelSheetColumnTitle(root.right));
    }
}