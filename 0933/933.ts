function numberOfRecentCalls(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfRecentCalls(root.left), numberOfRecentCalls(root.right));
}