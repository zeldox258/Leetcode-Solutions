function unitConversionI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(unitConversionI(root.left), unitConversionI(root.right));
}