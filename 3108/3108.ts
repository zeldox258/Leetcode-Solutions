function minimumCostWalkInWeightedGraph(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumCostWalkInWeightedGraph(root.left), minimumCostWalkInWeightedGraph(root.right));
}