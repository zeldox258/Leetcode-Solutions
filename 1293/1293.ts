function shortestPathInAGridWithObstacl(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(shortestPathInAGridWithObstacl(root.left), shortestPathInAGridWithObstacl(root.right));
}