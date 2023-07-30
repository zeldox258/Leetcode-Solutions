function countElementsWithStrictlySmall(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countElementsWithStrictlySmall(root.left), countElementsWithStrictlySmall(root.right));
}