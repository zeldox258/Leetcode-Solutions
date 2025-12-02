function maximumNumberOfRemovalQueriesT(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfRemovalQueriesT(root.left), maximumNumberOfRemovalQueriesT(root.right));
}