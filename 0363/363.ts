function maxSumOfRectangleNoLargerThanK(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maxSumOfRectangleNoLargerThanK(root.left), maxSumOfRectangleNoLargerThanK(root.right));
}