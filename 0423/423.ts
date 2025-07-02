function reconstructOriginalDigitsFromE(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(reconstructOriginalDigitsFromE(root.left), reconstructOriginalDigitsFromE(root.right));
}