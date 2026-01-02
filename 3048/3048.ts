function earliestSecondToMarkIndicesI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(earliestSecondToMarkIndicesI(root.left), earliestSecondToMarkIndicesI(root.right));
}