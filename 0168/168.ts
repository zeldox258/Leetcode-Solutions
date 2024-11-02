function excelSheetColumnTitle(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(excelSheetColumnTitle(root.left), excelSheetColumnTitle(root.right));
}