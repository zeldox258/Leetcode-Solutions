function minimumInversionCountInSubarra(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumInversionCountInSubarra(root.left), minimumInversionCountInSubarra(root.right));
}