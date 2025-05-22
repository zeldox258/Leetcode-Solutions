function deepObjectFilter(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(deepObjectFilter(root.left), deepObjectFilter(root.right));
}