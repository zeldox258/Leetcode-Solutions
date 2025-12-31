function maximumIceCreamBars(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumIceCreamBars(root.left), maximumIceCreamBars(root.right));
}