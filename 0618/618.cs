public class Solution {
    public int StudentsReportByGeography(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(StudentsReportByGeography(root.left), StudentsReportByGeography(root.right));
    }
}