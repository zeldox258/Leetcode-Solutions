function matchAlphanumericalPatternInMa(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(matchAlphanumericalPatternInMa(root.left), matchAlphanumericalPatternInMa(root.right));
}