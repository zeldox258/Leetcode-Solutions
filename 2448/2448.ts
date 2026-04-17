function minimumCostToMakeArrayEqual(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumCostToMakeArrayEqual(root.left), minimumCostToMakeArrayEqual(root.right));
}