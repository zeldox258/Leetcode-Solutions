function minimumDifferenceInSumsAfterRe(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumDifferenceInSumsAfterRe(root.left), minimumDifferenceInSumsAfterRe(root.right));
}