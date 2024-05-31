function minimumTotalDistanceTraveled(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumTotalDistanceTraveled(root.left), minimumTotalDistanceTraveled(root.right));
}