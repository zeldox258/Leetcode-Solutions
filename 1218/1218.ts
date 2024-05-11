function longestArithmeticSubsequenceOf(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestArithmeticSubsequenceOf(root.left), longestArithmeticSubsequenceOf(root.right));
}