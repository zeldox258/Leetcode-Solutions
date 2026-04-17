function findTheLeastFrequentDigit(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheLeastFrequentDigit(root.left), findTheLeastFrequentDigit(root.right));
}