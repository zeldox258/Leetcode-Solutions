function differenceBetweenMaximumAndMin(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(differenceBetweenMaximumAndMin(root.left), differenceBetweenMaximumAndMin(root.right));
}