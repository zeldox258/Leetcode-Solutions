function maxChunksToMakeSortedIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maxChunksToMakeSortedIi(root.left), maxChunksToMakeSortedIi(root.right));
}