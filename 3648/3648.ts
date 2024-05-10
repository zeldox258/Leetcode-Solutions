function minimumSensorsToCoverGrid(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumSensorsToCoverGrid(root.left), minimumSensorsToCoverGrid(root.right));
}