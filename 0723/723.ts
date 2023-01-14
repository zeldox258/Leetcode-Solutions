function candyCrush(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(candyCrush(root.left), candyCrush(root.right));
}