function longestCommonSuffixQueries(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSuffixQueries(root.left), longestCommonSuffixQueries(root.right));
}