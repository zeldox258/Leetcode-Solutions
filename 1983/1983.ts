function widestPairOfIndicesWithEqualRa(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(widestPairOfIndicesWithEqualRa(root.left), widestPairOfIndicesWithEqualRa(root.right));
}