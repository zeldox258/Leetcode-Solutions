function longestCommonSubsequence(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSubsequence(root.left), longestCommonSubsequence(root.right));
}