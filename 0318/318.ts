function maximumProductOfWordLengths(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumProductOfWordLengths(root.left), maximumProductOfWordLengths(root.right));
}