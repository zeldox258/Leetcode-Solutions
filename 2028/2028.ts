function findMissingObservations(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findMissingObservations(root.left), findMissingObservations(root.right));
}