function constructStringWithMinimumCost(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(constructStringWithMinimumCost(root.left), constructStringWithMinimumCost(root.right));
}