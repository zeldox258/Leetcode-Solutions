function studentsReportByGeography(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(studentsReportByGeography(root.left), studentsReportByGeography(root.right));
}