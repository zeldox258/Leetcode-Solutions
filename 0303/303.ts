function rangeSumQueryImmutable(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(rangeSumQueryImmutable(root.left), rangeSumQueryImmutable(root.right));
}