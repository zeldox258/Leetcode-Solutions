function sumOfScoresOfBuiltStrings(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfScoresOfBuiltStrings(root.left), sumOfScoresOfBuiltStrings(root.right));
}