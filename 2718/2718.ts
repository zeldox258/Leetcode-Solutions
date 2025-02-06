function sumOfMatrixAfterQueries(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfMatrixAfterQueries(root.left), sumOfMatrixAfterQueries(root.right));
}