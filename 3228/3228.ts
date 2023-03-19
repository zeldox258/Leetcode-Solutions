function maximumNumberOfOperationsToMov(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfOperationsToMov(root.left), maximumNumberOfOperationsToMov(root.right));
}