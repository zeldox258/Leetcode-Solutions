function numberOfDistinctSubstringsInAS(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfDistinctSubstringsInAS(root.left), numberOfDistinctSubstringsInAS(root.right));
}