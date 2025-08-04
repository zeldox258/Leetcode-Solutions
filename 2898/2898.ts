function maximumLinearStockScore(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumLinearStockScore(root.left), maximumLinearStockScore(root.right));
}