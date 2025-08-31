function smallestGoodBase(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(smallestGoodBase(root.left), smallestGoodBase(root.right));
}