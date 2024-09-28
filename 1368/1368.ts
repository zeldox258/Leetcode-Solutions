function minimumCostToMakeAtLeastOneVal(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumCostToMakeAtLeastOneVal(root.left), minimumCostToMakeAtLeastOneVal(root.right));
}