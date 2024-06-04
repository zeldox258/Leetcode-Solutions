function 4sum(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(4sum(root.left), 4sum(root.right));
}