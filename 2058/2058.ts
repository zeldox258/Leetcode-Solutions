function findTheMinimumAndMaximumNumber(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheMinimumAndMaximumNumber(root.left), findTheMinimumAndMaximumNumber(root.right));
}