function minimumImpossibleOr(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumImpossibleOr(root.left), minimumImpossibleOr(root.right));
}