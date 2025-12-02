function countPairsWithXorInARange(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countPairsWithXorInARange(root.left), countPairsWithXorInARange(root.right));
}