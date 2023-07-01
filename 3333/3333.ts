function findTheOriginalTypedStringIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheOriginalTypedStringIi(root.left), findTheOriginalTypedStringIi(root.right));
}