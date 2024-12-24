function makeCostsOfPathsEqualInABinary(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(makeCostsOfPathsEqualInABinary(root.left), makeCostsOfPathsEqualInABinary(root.right));
}