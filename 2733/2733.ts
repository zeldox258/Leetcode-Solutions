function neitherMinimumNorMaximum(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(neitherMinimumNorMaximum(root.left), neitherMinimumNorMaximum(root.right));
}