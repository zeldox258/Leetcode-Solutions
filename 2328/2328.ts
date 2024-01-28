function numberOfIncreasingPathsInAGrid(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfIncreasingPathsInAGrid(root.left), numberOfIncreasingPathsInAGrid(root.right));
}