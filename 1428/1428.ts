function leftmostColumnWithAtLeastAOne(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(leftmostColumnWithAtLeastAOne(root.left), leftmostColumnWithAtLeastAOne(root.right));
}