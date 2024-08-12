function totalWavinessOfNumbersInRangeI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(totalWavinessOfNumbersInRangeI(root.left), totalWavinessOfNumbersInRangeI(root.right));
}