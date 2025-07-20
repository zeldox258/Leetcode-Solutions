function dropMissingData(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(dropMissingData(root.left), dropMissingData(root.right));
}