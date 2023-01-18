function minimumNumberOfChairsInAWaitin(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfChairsInAWaitin(root.left), minimumNumberOfChairsInAWaitin(root.right));
}