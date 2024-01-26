function maximumWeightedKedgePath(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumWeightedKedgePath(root.left), maximumWeightedKedgePath(root.right));
}