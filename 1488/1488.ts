function avoidFloodInTheCity(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(avoidFloodInTheCity(root.left), avoidFloodInTheCity(root.right));
}