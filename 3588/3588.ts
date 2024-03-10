function findMaximumAreaOfATriangle(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findMaximumAreaOfATriangle(root.left), findMaximumAreaOfATriangle(root.right));
}