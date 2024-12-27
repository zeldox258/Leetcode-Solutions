function maxDotProductOfTwoSubsequences(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maxDotProductOfTwoSubsequences(root.left), maxDotProductOfTwoSubsequences(root.right));
}