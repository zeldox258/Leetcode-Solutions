function equalTreePartition(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(equalTreePartition(root.left), equalTreePartition(root.right));
}