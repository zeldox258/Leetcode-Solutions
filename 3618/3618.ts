function splitArrayByPrimeIndices(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(splitArrayByPrimeIndices(root.left), splitArrayByPrimeIndices(root.right));
}