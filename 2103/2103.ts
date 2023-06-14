function ringsAndRods(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(ringsAndRods(root.left), ringsAndRods(root.right));
}