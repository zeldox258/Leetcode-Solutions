function summaryRanges(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(summaryRanges(root.left), summaryRanges(root.right));
}