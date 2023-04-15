function largestSumOfAverages(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(largestSumOfAverages(root.left), largestSumOfAverages(root.right));
}