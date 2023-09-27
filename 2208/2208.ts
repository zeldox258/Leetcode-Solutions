function minimumOperationsToHalveArrayS(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumOperationsToHalveArrayS(root.left), minimumOperationsToHalveArrayS(root.right));
}