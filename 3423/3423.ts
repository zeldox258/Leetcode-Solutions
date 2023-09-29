function maximumDifferenceBetweenAdjace(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumDifferenceBetweenAdjace(root.left), maximumDifferenceBetweenAdjace(root.right));
}